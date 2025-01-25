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
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();

    @Override
    public Void visit(Program program){
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            visitFunction(functionDeclaration);
        }
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            visitPattern(patternDeclaration);
        }
        program.getMain().accept(this);
        return null;
    }

    private void visitFunction(FunctionDeclaration functionDeclaration) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        try {
            SymbolTable.root.put(functionItem);
        }
        catch (ItemAlreadyExists ignored) {}
        SymbolTable functionSymbolTable = new SymbolTable();
        functionItem.setFunctionSymbolTable(functionSymbolTable);
        SymbolTable.push(functionSymbolTable);
        functionDeclaration.accept(this);
        SymbolTable.pop();
    }

    private void visitPattern(PatternDeclaration patternDeclaration) {
        PatternItem patternItem = new PatternItem(patternDeclaration);
        SymbolTable patternSymbolTable = new SymbolTable();
        patternItem.setPatternSymbolTable(patternSymbolTable);
        SymbolTable.push(patternSymbolTable);
        patternDeclaration.accept(this);
        SymbolTable.pop();
    }

    @Override
    public Void visit(Identifier identifier){
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration){
        try {
            Identifier id = varDeclaration.getName();
            VarItem varItem = new VarItem(id);
            SymbolTable.top.put(varItem);
        }
        catch (ItemAlreadyExists error) {}
        Optional.ofNullable(varDeclaration.getDefaultVal()).ifPresent(defaultVal -> defaultVal.accept(this));
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration)
    {
        functionDeclaration.getFunctionName().accept(this);

        Iterator<VarDeclaration> varDeclarationIterator = functionDeclaration.getArgs().iterator();
        while (varDeclarationIterator.hasNext()) {
            VarDeclaration varDeclaration = varDeclarationIterator.next();
            Optional.ofNullable(varDeclaration.getDefaultVal()).ifPresent(defaultVal -> defaultVal.accept(this));
        }

        Iterator<Statement> statementIterator = functionDeclaration.getBody().iterator();
        while (statementIterator.hasNext()) {
            Statement statement = statementIterator.next();
            statement.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(PatternDeclaration patternDeclaration) {
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement){
        Optional.ofNullable(returnStatement.getReturnExp()).ifPresent(returnExp -> returnExp.accept(this));
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement){
        SymbolTable.push(new SymbolTable(SymbolTable.top));

        Iterator<Expression> conditionIterator = ifStatement.getConditions().iterator();
        while (conditionIterator.hasNext()) {
            Expression condition = conditionIterator.next();
            condition.accept(this);
        }

        Iterator<Statement> thenStmIterator = ifStatement.getThenBody().iterator();
        while (thenStmIterator.hasNext()) {
            Statement thenStm = thenStmIterator.next();
            thenStm.accept(this);
        }

        Iterator<Statement> elseStmIterator = ifStatement.getElseBody().iterator();
        while (elseStmIterator.hasNext()) {
            Statement elseStm = elseStmIterator.next();
            elseStm.accept(this);
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

        Iterator<Expression> conditionIterator = loopDoStatement.getLoopConditions().iterator();
        while (conditionIterator.hasNext()) {
            Expression condition = conditionIterator.next();
            condition.accept(this);
        }

        Iterator<Statement> statementIterator = loopDoStatement.getLoopBodyStmts().iterator();
        while (statementIterator.hasNext()) {
            Statement statement = statementIterator.next();
            statement.accept(this);
        }

        Optional.ofNullable(loopDoStatement.getLoopRetStmt()).ifPresent(loopRetStmt -> loopRetStmt.accept(this));
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement){
        SymbolTable.push(new SymbolTable(SymbolTable.top));

        Iterator<Expression> rangeExpIterator = forStatement.getRangeExpressions().iterator();
        while (rangeExpIterator.hasNext()) {
            Expression rangeExp = rangeExpIterator.next();
            rangeExp.accept(this);
        }

        try {
            SymbolTable.top.put(new VarItem(forStatement.getIteratorId()));
        }
        catch (ItemAlreadyExists error) {}

        Iterator<Expression> bodyExpIterator = forStatement.getLoopBodyExpressions().iterator();
        while (bodyExpIterator.hasNext()) {
            Expression bodyExp = bodyExpIterator.next();
            bodyExp.accept(this);
        }

        Iterator<Statement> stmIterator = forStatement.getLoopBody().iterator();
        while (stmIterator.hasNext()) {
            Statement stm = stmIterator.next();
            stm.accept(this);
        }

        Optional.ofNullable(forStatement.getReturnStatement()).ifPresent(returnStatement -> returnStatement.accept(this));
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement){
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
            Optional.ofNullable(assignStatement.getAccessListExpression()).ifPresent(accessListExpression -> accessListExpression.accept(this));
            Optional.ofNullable(assignStatement.getAssignExpression()).ifPresent(assignExpression -> assignExpression.accept(this));
        }
        else {
            Optional.ofNullable(assignStatement.getAssignExpression()).ifPresent(assignExpression -> assignExpression.accept(this));
            try {
                SymbolTable.top.put(new VarItem(assignStatement.getAssignedId()));
            }
            catch (ItemAlreadyExists e) {}
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

        Iterator<Expression> appendedIterator = appendExpression.getAppendeds().iterator();
        while (appendedIterator.hasNext()) {
            Expression appended = appendedIterator.next();
            appended.accept(this);
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
                FunctionDeclaration fd = new FunctionDeclaration();
                fd.setFunctionName(id);
                FunctionItem functionItem = new FunctionItem(fd);
                if (((FunctionItem) SymbolTable.root.getItems()) != null && !((FunctionItem) SymbolTable.root.getItems()).getName().equals(functionItem.getName())) {
                    dependencyGraph.addEdge(((FunctionItem) SymbolTable.root.getItems()).getName(), functionItem.getName());
                }
            }
            else if (accessExpression.getAccessedExpression() instanceof LambdaExpression lamExp) {
                lamExp.accept(this);
            }
            else {
                accessExpression.getAccessedExpression().accept(this);
            }

            Iterator<Expression> argIterator = accessExpression.getArguments().iterator();
            while (argIterator.hasNext()) {
                Expression arg = argIterator.next();
                arg.accept(this);
            }

            Iterator<Expression> listAccessIterator = accessExpression.getDimentionalAccess().iterator();
            while (listAccessIterator.hasNext()) {
                Expression listAccess = listAccessIterator.next();
                listAccess.accept(this);
            }

        }
        else {
            Optional.ofNullable(accessExpression.getAccessedExpression()).ifPresent(accessedExpression -> accessedExpression.accept(this));

            Iterator<Expression> listAccessIterator = accessExpression.getDimentionalAccess().iterator();
            while (listAccessIterator.hasNext()) {
                Expression listAccess = listAccessIterator.next();
                listAccess.accept(this);
            }

        }
        return null;
    }

    @Override
    public Void visit(LambdaExpression lambdaExpression){
        Iterator<Statement> statementIterator = lambdaExpression.getBody().iterator();
        while (statementIterator.hasNext()) {
            Statement statement = statementIterator.next();
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ListValue listValue){
        Iterator<Expression> expIterator = listValue.getElements().iterator();
        while (expIterator.hasNext()) {
            Expression exp = expIterator.next();
            exp.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionPointer functionPointer){return null;}
    @Override
    public Void visit(BoolValue boolValue){return null;}
    @Override
    public Void visit(IntValue intValue){return null;}
    @Override
    public Void visit(StringValue stringValue){return null;}
    @Override
    public Void visit(FloatValue floatValue){return null;}




    //TODO:visit function declarations and construct dependency graph
    public Void findDependency(){
        for(List<String> cycle : dependencyGraph.findCycles()){
            dependencyError.add(new CircularDependency(cycle));
        }
        return null;
    }

}
