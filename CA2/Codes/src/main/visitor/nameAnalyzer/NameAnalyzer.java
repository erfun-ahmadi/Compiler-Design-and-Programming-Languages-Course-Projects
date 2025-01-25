package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.FloatValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        //TODO: addFunctions,
        int duplicateFunctionId = 0;
        ArrayList<FunctionItem> functionItems = new ArrayList<>();
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
                functionItems.add(functionItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfFunction(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
                duplicateFunctionId += 1;
                String freshName = functionItem.getName() + "#" + String.valueOf(duplicateFunctionId);
                Identifier newId = functionDeclaration.getFunctionName();
                newId.setName(freshName);
                functionDeclaration.setFunctionName(newId);
                FunctionItem newItem = new FunctionItem(functionDeclaration);
                functionItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + String.valueOf(duplicatePatternId);
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //TODO:visitFunctions
        int visitingFunctionIndex = 0;
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = functionItems.get(visitingFunctionIndex);
            SymbolTable functionSymbolTable = new SymbolTable();
            functionItem.setFunctionSymbolTable(functionSymbolTable);
            SymbolTable.push(functionSymbolTable);
            functionDeclaration.accept(this);
            SymbolTable.pop();
            visitingFunctionIndex += 1;
        }

        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            SymbolTable patternSymbolTable = new SymbolTable();
            patternItem.setPatternSymbolTable(patternSymbolTable);
            SymbolTable.push(patternSymbolTable);
            patternDeclaration.accept(this);
            SymbolTable.pop();
            visitingPatternIndex += 1;
        }

        //visitMain
        program.getMain().accept(this);
        return null;
    }

    //TODO:visit all other AST nodes and find name errors
    @Override
    public Void visit(Identifier identifier){
        VarItem varItem = new VarItem(identifier);
        try {
            SymbolTable.top.getItem(varItem.getKey());
        }
        catch (ItemNotFound error) {
            nameErrors.add(new VariableNotDeclared(identifier.getLine(), identifier.getName()));
        }
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration){
        VarItem varItem = new VarItem(varDeclaration.getName());
        try {
            SymbolTable.top.put(varItem);
        }
        catch (ItemAlreadyExists ignored) {}

        Optional.ofNullable(varDeclaration.getDefaultVal()).ifPresent(defaultVal -> defaultVal.accept(this));

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration){
        Identifier funcName = functionDeclaration.getFunctionName();

        Iterator<VarDeclaration> iterator = functionDeclaration.getArgs().iterator();
        while (iterator.hasNext()) {
            VarDeclaration arg = iterator.next();
            if (arg.getName().getName().equals(funcName.getName())) {
                nameErrors.add(new IdenticalArgFunctionName(funcName.getLine(), arg.getName().getName()));
            }
        }

        iterator = functionDeclaration.getArgs().iterator();
        while (iterator.hasNext()) {
            VarDeclaration varDec = iterator.next();
            varDec.accept(this);
        }

        Iterator<Statement> iterator2 = functionDeclaration.getBody().iterator();
        while (iterator2.hasNext()) {
            Statement statement = iterator2.next();
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(PatternDeclaration patternDeclaration) {
        if (patternDeclaration.getTargetVariable().getName().equals(patternDeclaration.getPatternName().getName())) {
            nameErrors.add(new IdenticalArgPatternName(patternDeclaration.getTargetVariable().getLine(), patternDeclaration.getPatternName().getName()));
        }
        try {
            SymbolTable.top.put(new VarItem(patternDeclaration.getTargetVariable()));
        }
        catch (ItemAlreadyExists ignored) {}

        Iterator<Expression> iterator = patternDeclaration.getConditions().iterator();
        while (iterator.hasNext()) {
            Expression condition = iterator.next();
            condition.accept(this);
        }

        iterator = patternDeclaration.getReturnExp().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            exp.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        Iterator<Statement> iterator = mainDeclaration.getBody().iterator();
        while (iterator.hasNext()) {
            Statement statement = iterator.next();
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement){
        Optional.ofNullable(returnStatement.getReturnExp()).ifPresent(returnExp -> returnExp.accept(this));
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement){
        Iterator<Expression> iterator = ifStatement.getConditions().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            exp.accept(this);
        }

        SymbolTable.push(new SymbolTable(SymbolTable.top));

        Iterator<Statement> iterator1 = ifStatement.getThenBody().iterator();
        while (iterator1.hasNext()) {
            Statement statement = iterator1.next();
            statement.accept(this);
        }

        SymbolTable.pop();
        SymbolTable.push(new SymbolTable(SymbolTable.top));

        iterator1 = ifStatement.getElseBody().iterator();
        while (iterator1.hasNext()) {
            Statement statement = iterator1.next();
            statement.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(PutStatement putStatement){
        Optional.ofNullable(putStatement.getExpression()).ifPresent(expression -> expression.accept(this));
        return null;
    }

    @Override
    public Void visit(LenStatement lenStatement){
        Optional.ofNullable(lenStatement.getExpression()).ifPresent(expression -> expression.accept(this));
        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement){
        Optional.ofNullable(pushStatement.getInitial()).ifPresent(initial -> initial.accept(this));
        Optional.ofNullable(pushStatement.getToBeAdded()).ifPresent(toBeAdded -> toBeAdded.accept(this));
        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(new SymbolTable(SymbolTable.top));

        Iterator<Expression> iterator = loopDoStatement.getLoopConditions().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            exp.accept(this);
        }

        Iterator<Statement> iterator1 = loopDoStatement.getLoopBodyStmts().iterator();
        while (iterator1.hasNext()) {
            Statement statement = iterator1.next();
            statement.accept(this);
        }
        Optional.ofNullable(loopDoStatement.getLoopRetStmt()).ifPresent(loopRetStmt -> loopRetStmt.accept(this));
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement){
        SymbolTable.push(new SymbolTable(SymbolTable.top));

        Iterator<Expression> iterator = forStatement.getRangeExpressions().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            exp.accept(this);
        }

        try {
            SymbolTable.top.put(new VarItem(forStatement.getIteratorId()));
        }
        catch (ItemAlreadyExists error) {}

        iterator = forStatement.getLoopBodyExpressions().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            exp.accept(this);
        }

        Iterator<Statement> iterator1 = forStatement.getLoopBody().iterator();
        while (iterator1.hasNext()) {
            Statement statement = iterator1.next();
            statement.accept(this);
        }
        Optional.ofNullable(forStatement.getReturnStatement()).ifPresent(returnStatement -> returnStatement.accept(this));
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement){
        try {
            SymbolTable.root.getItem(new PatternItem(new PatternDeclaration(matchPatternStatement.getPatternId(), null)).getKey());
        }
        catch (ItemNotFound e) {
            nameErrors.add(new PatternNotDeclared(matchPatternStatement.getPatternId().getLine(), matchPatternStatement.getPatternId().getName()));
        }
        Optional.ofNullable(matchPatternStatement.getMatchArgument()).ifPresent(matchArgument -> matchArgument.accept(this));
        return null;
    }

    @Override
    public Void visit(ChopStatement chopStatement){
        Optional.ofNullable(chopStatement.getChopExpression()).ifPresent(chopExpression -> chopExpression.accept(this));
        return null;
    }

    @Override
    public Void visit(ChompStatement chompStatement){
        Optional.ofNullable(chompStatement.getChompExpression()).ifPresent(chompExpression -> chompExpression.accept(this));
        return null;
    }

    @Override
    public Void visit(AssignStatement assignStatement){
        if (assignStatement.isAccessList()) {
            try {
                VarItem varItem = new VarItem(assignStatement.getAssignedId());
                SymbolTable.top.getItem(varItem.getKey());
            }
            catch (ItemNotFound error) {
                nameErrors.add(new VariableNotDeclared(assignStatement.getAssignedId().getLine(), assignStatement.getAssignedId().getName()));
            }
            Optional.ofNullable(assignStatement.getAccessListExpression()).ifPresent(accessListExpression -> accessListExpression.accept(this));
            Optional.ofNullable(assignStatement.getAssignExpression()).ifPresent(assignExpression -> assignExpression.accept(this));
        }
        else {
            Optional.ofNullable(assignStatement.getAssignExpression()).ifPresent(assignExpression -> assignExpression.accept(this));
            VarItem varItem = new VarItem(assignStatement.getAssignedId());
            if (assignStatement.getAssignOperator() == AssignOperator.ASSIGN){
                try {
                    SymbolTable.top.put(varItem);
                }
                catch (ItemAlreadyExists error) {}
            }
            else {
                try {
                    SymbolTable.top.getItem(varItem.getKey());
                }
                catch (ItemNotFound e) {
                    nameErrors.add(new VariableNotDeclared(assignStatement.getAssignedId().getLine(), assignStatement.getAssignedId().getName()));
                }
            }
        }
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement){
        Optional.ofNullable(expressionStatement.getExpression()).ifPresent(expression -> expression.accept(this));
        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression){
        Optional.ofNullable(appendExpression.getAppendee()).ifPresent(appendee -> appendee.accept(this));

        Iterator<Expression> iterator = appendExpression.getAppendeds().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            exp.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression){
        Optional.ofNullable(binaryExpression.getFirstOperand()).ifPresent(firstOperand -> firstOperand.accept(this));
        Optional.ofNullable(binaryExpression.getSecondOperand()).ifPresent(secondOperand -> secondOperand.accept(this));
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression){
        Optional.ofNullable(unaryExpression.getExpression()).ifPresent(expression -> expression.accept(this));
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression){
        if (accessExpression.isFunctionCall()) {
            if (accessExpression.getAccessedExpression() instanceof Identifier id) {
                try {
                    FunctionDeclaration functionDeclaration = new FunctionDeclaration();
                    functionDeclaration.setFunctionName(id);
                    FunctionItem functionItem = new FunctionItem(functionDeclaration);
                    FunctionItem realFunc = (FunctionItem) SymbolTable.root.getItem(functionItem.getKey());
                    if (!realFunc.getFunctionDeclaration().isNumOfArgsOk(accessExpression.getArguments().size())) {
                        nameErrors.add(new ArgMisMatch(id.getLine(), id.getName()));
                    }
                }
                catch (ItemNotFound error) {
                    nameErrors.add(new FunctionNotDeclared(id.getLine(), id.getName()));
                }
            }
            else if (accessExpression.getAccessedExpression() instanceof LambdaExpression lamExp) {
                lamExp.accept(this);
                if (!lamExp.isNumOfArgsOk(accessExpression.getArguments().size())) {
                    nameErrors.add(new ArgMisMatch(lamExp.getLine(), "LambdaExpression"));
                }
            }
            else {
                accessExpression.getAccessedExpression().accept(this);
            }

            Iterator<Expression> iterator = accessExpression.getArguments().iterator();
            while (iterator.hasNext()) {
                Expression exp = iterator.next();
                exp.accept(this);
            }

            iterator = accessExpression.getDimentionalAccess().iterator();
            while (iterator.hasNext()) {
                Expression exp = iterator.next();
                exp.accept(this);
            }
        }
        else {
            Optional.ofNullable(accessExpression.getAccessedExpression()).ifPresent(accessedExpression -> accessedExpression.accept(this));
            Iterator<Expression> iterator = accessExpression.getDimentionalAccess().iterator();
            while (iterator.hasNext()) {
                Expression exp = iterator.next();
                exp.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(LambdaExpression lambdaExpression){
        SymbolTable.push(new SymbolTable(SymbolTable.top));

        Iterator<VarDeclaration> iterator = lambdaExpression.getDeclarationArgs().iterator();
        while (iterator.hasNext()) {
            VarDeclaration varDec = iterator.next();
            varDec.accept(this);
        }

        Iterator<Statement> iterator1 = lambdaExpression.getBody().iterator();
        while (iterator1.hasNext()) {
            Statement statement = iterator1.next();
            statement.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ListValue listValue){
        Iterator<Expression> iterator = listValue.getElements().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            exp.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionPointer functionPointer){
        try {
            FunctionDeclaration functionDeclaration = new FunctionDeclaration();
            functionDeclaration.setFunctionName(functionPointer.getId());
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            SymbolTable.root.getItem(functionItem.getKey());
        }
        catch (ItemNotFound e) {
            nameErrors.add(new FunctionNotDeclared(functionPointer.getId().getLine(), functionPointer.getId().getName()));
        }
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue){return null;}

    @Override
    public Void visit(IntValue intValue){return null;}

    @Override
    public Void visit(StringValue stringValue){return null;}

    @Override
    public Void visit(FloatValue floatValue){return null;}
}