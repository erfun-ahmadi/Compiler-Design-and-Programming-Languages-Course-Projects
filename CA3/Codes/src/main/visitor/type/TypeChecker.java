package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;
import java.util.function.Consumer;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    public ArrayList<Type> returnTable = new ArrayList<>();
    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                argItem.setType(currentArgTypes.size() > i ? currentArgTypes.get(i) :
                        functionDeclaration.getArgs().get(i).getDefaultVal().accept(this));
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}
        returnTable.clear();
        for(Statement statement : functionDeclaration.getBody()) {
            statement.accept(this);
        }

        //TODO:Figure out whether return types of functions are not the same.
        Iterator<Type> iterator = returnTable.iterator();
        Type firstType = iterator.next();
        while (iterator.hasNext()) {
            Type nextType = iterator.next();
            if (!nextType.sameType(firstType)) {
                FunctionIncompatibleReturnTypes returnError = new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName());
                if (!typeErrors.contains(returnError)) {
                    typeErrors.add(returnError);
                }
                SymbolTable.pop();
                return new NoType();
            }
        }

        SymbolTable.pop();

        //TODO:Return the infered type of the function
        if(!returnTable.isEmpty()) {
            return returnTable.getFirst();
        }
        return new NoType();
    }

    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){
                if(!(expression.accept(this) instanceof BoolType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }
            //TODO:1-figure out whether return expression of different cases in pattern are of the same type/2-return the infered type
            ArrayList<Type> types = new ArrayList<>();
            Iterator<Expression> iterator = patternDeclaration.getReturnExp().iterator();
            while (iterator.hasNext()) {
                Expression expression = iterator.next();
                types.add(expression.accept(this));
                if(!(types.getLast().sameType(types.getFirst()))){
                    typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }

            SymbolTable.pop();
            return types.getFirst();

        }catch (ItemNotFound ignored){}


        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        //TODO:visit main
        Iterator<Statement> iterator = mainDeclaration.getBody().iterator();
        while (iterator.hasNext()) {
            Statement statement = iterator.next();
            statement.accept(this);
        }
        return null;
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        if(accessExpression.isFunctionCall()){
            //TODO:function is called here.set the arguments type and visit its declaration
            try {
                return accessExpressionIsFunctionCall(accessExpression);
            }
            catch(ItemNotFound ignore){}
        }
        else{
            return accessExpressionIsNotFunctionCall(accessExpression);
        }
        return new NoType();
    }

    private Type accessExpressionIsFunctionCall(AccessExpression accessExpression) throws ItemNotFound {
        Identifier identifier = (Identifier) accessExpression.getAccessedExpression();
        Type type = identifier.accept(this);
        FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                ((type instanceof FptrType) ? ((FptrType) type).getFunctionName() : identifier.getName()));
        ArrayList<Type> types = new ArrayList<>();
        Iterator<Expression> iterator = accessExpression.getArguments().iterator();
        while (iterator.hasNext()) {
            Expression exp = iterator.next();
            types.add(exp.accept(this));
        }
        functionItem.setArgumentTypes(types);
        return functionItem.getFunctionDeclaration().accept(this);
    }

    private Type accessExpressionIsNotFunctionCall(AccessExpression accessExpression) {
        Type accessedType = accessExpression.getAccessedExpression().accept(this);
        if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType)){
            typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
            return new NoType();
        }
        //TODO:index of access list must be int
        else if(accessedType instanceof StringType) {
            if (!(accessExpression.getDimentionalAccess().getFirst().accept(this) instanceof IntType)) {
                typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                return new NoType();
            }
            return new StringType();
        }
        else {
            if(!(accessExpression.getDimentionalAccess().getFirst().accept(this) instanceof IntType)){
                typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                return new NoType();
            }
            return ((ListType) accessedType).getType();
        }
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        // TODO:Visit return statement.Note that return type of functions are specified here
        Type type = returnStatement.getReturnExp().accept(this);
        returnTable.add(type);
        return type;
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);

    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        Type type = forStatement.getRangeExpression().accept(this);
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        try{
            varItem.setType(type);
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }
    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions())
            if(!(expression.accept(this) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        for(Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for(Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(AssignStatement assignStatement){
        // TODO:assignment to list
        Consumer<AssignStatement> assignStatementConsumer = assignStatement.isAccessList()
                ? this::assignStatementIsAccessList
                : this::assignStatementIsNotAccessList;

        assignStatementConsumer.accept(assignStatement);
        return new NoType();
    }

    private void assignStatementIsAccessList(AssignStatement assignStatement) {
        if(!(assignStatement.getAccessListExpression().accept(this) instanceof IntType)){
            typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
        }
        if(!((ListType)assignStatement.getAssignedId().accept(this)).getType().sameType(
                assignStatement.getAssignExpression().accept(this))){
            typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
        }
    }

    private void assignStatementIsNotAccessList(AssignStatement assignStatement) {
        VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
        // TODO:maybe new type for a variable
        Type assignType = assignStatement.getAssignExpression().accept(this);
        newVarItem.setType(assignType);
        try {
            SymbolTable.top.put(newVarItem);
        }catch (ItemAlreadyExists ignored) {
            try {
                if(SymbolTable.top.getItem("VAR:" + newVarItem.getName()) instanceof VarItem varItem) {
                    varItem.setType(assignType);
                }
            } catch (ItemNotFound ignore){}
        }
    }

    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(PushStatement pushStatement){
        //TODO:visit push statement
        Type initType = pushStatement.getInitial().accept(this);
        Type toBeAddedType = pushStatement.getToBeAdded().accept(this);

        if (!(initType instanceof StringType) && !(initType instanceof ListType)) {
            typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
        }
        if ((initType instanceof StringType) && !(toBeAddedType instanceof StringType)) {
            typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
        }
        if (initType instanceof ListType listType) {
            if (!listType.getType().sameType(toBeAddedType)) {
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
            }
            if(listType.getType() instanceof NoType) {
                listType.setType(toBeAddedType);
            }
        }
        return new NoType();
    }
    @Override
    public Type visit(PutStatement putStatement){
        //TODO:visit putStatement
        if(putStatement.getExpression().accept(this) instanceof FptrType){
            typeErrors.add(new IsNotPrintable(putStatement.getLine()));
        }
        return new NoType();
    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        if(listValue.getElements().isEmpty()){
            return new ListType(new NoType());
        }
        Type type = listValue.getElements().getFirst().accept(this);
        for (Expression expression : listValue.getElements()) {
            Type thisType = expression.accept(this);
            if (!type.sameType(thisType)) {
                typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
                return new NoType();
            }
        }
        return new ListType(type);
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }
    @Override
    public Type visit(BinaryExpression binaryExpression){
        //TODO:visit binary expression
        Type firstOp = binaryExpression.getFirstOperand().accept(this);
        Type secondOp = binaryExpression.getSecondOperand().accept(this);
        if(firstOp instanceof NoType || secondOp instanceof NoType){
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().toString()));
        }
        else if(!firstOp.sameType(secondOp)){
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binaryExpression.getOperator()));
        }
        else if(firstOp.sameType(secondOp)){
            return (!(binaryExpression.getOperator() == BinaryOperator.EQUAL) &&
                    !(binaryExpression.getOperator() == BinaryOperator.NOT_EQUAL)) ? binaryExpressionExceptEqualNotEqual(binaryExpression, firstOp)
                    : binaryExpressionEqualNotEqual(binaryExpression, firstOp);
        }
        return new NoType();
    }

    private Type binaryExpressionExceptEqualNotEqual(BinaryExpression binaryExpression, Type firstOp) {
        if(!(firstOp instanceof IntType) && !(firstOp instanceof FloatType)){
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().toString()));
        }
        else if(binaryExpression.getOperator() == BinaryOperator.GREATER_THAN ||
                binaryExpression.getOperator() == BinaryOperator.LESS_THAN ||
                binaryExpression.getOperator() == BinaryOperator.GREATER_EQUAL_THAN ||
                binaryExpression.getOperator() == BinaryOperator.LESS_EQUAL_THAN) {
            return new BoolType();
        }
        return firstOp;
    }

    private Type binaryExpressionEqualNotEqual(BinaryExpression binaryExpression, Type firstOp) {
        if(firstOp instanceof FptrType || firstOp instanceof NoType){
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().toString()));
            return firstOp;
        }
        return new BoolType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression){
        //TODO:visit unaryExpression
        Type op = unaryExpression.getExpression().accept(this);
        return (unaryExpression.getOperator() == UnaryOperator.NOT) ? unaryExpressionNot(unaryExpression, op) :
                unaryExpressionExceptNot(unaryExpression, op);
    }

    private Type unaryExpressionNot(UnaryExpression unaryExpression, Type op) {
        if(!(op instanceof BoolType)){
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().toString()));
            return new NoType();
        }
        return op;
    }

    private Type unaryExpressionExceptNot(UnaryExpression unaryExpression, Type op) {
        if(!(op instanceof IntType || op instanceof FloatType)){
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().toString()));
            return new NoType();
        }
        return op;
    }

    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){
        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        // TODO:visit Identifier
        SymbolTable symbolTable = SymbolTable.top;
        SymbolTableItem foundItem = null;
        try {
            foundItem = symbolTable.getItem("VAR:" + identifier.getName());
        } catch (ItemNotFound ignored) {}
        if (foundItem instanceof VarItem) {
            return ((VarItem) foundItem).getType();
        }
        return new NoType();
    }
    @Override
    public Type visit(LenStatement lenStatement){
        //TODO:visit LenStatement.Be carefull about the return type of LenStatement.
        Type lenExpressionType = lenStatement.getExpression().accept(this);
        if(!(lenExpressionType instanceof ListType) && !(lenExpressionType instanceof StringType)){
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new NoType();
        }
        return new IntType();
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        RangeType rangeType = rangeExpression.getRangeType();
        // TODO --> mind that the lists are declared explicitly in the grammar in this node, so handle the errors
        switch (rangeType) {
            case RangeType.LIST:
                return rangeTypeList(rangeExpression);
            case RangeType.DOUBLE_DOT:
                return rangeTypeDoubleDot(rangeExpression);
            case RangeType.IDENTIFIER: {
                typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                return new NoType();
            }
        }
        return new NoType();
    }

    private Type rangeTypeList(RangeExpression rangeExpression) {
        Type rangeExpressionType = rangeExpression.getRangeExpressions().getFirst().accept(this);
        if(!(rangeExpressionType instanceof ListType)){
            typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
            return new NoType();
        }
        return ((ListType) rangeExpressionType).getType();
    }

    private Type rangeTypeDoubleDot(RangeExpression rangeExpression) {
        Type firstType = rangeExpression.getRangeExpressions().getFirst().accept(this);
        Type secondType = rangeExpression.getRangeExpressions().getLast().accept(this);
        if(!(firstType instanceof IntType && secondType instanceof IntType)){
            typeErrors.add(new RangeValuesMisMatch(rangeExpression.getLine()));
            return new NoType();
        }
        return new IntType();
    }
}
