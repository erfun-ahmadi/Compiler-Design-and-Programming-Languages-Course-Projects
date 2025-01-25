package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private final ArrayList<String> endPoints = new ArrayList<String>();
    private final ArrayList<String> startPoints = new ArrayList<String>();
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;

    public CodeGenerator(TypeChecker typeChecker){
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }
    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }
    public String getFreshLabel(){
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }
    public String getType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "Ljava/lang/Integer;";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "Ljava/util/ArrayList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> {
                type += "V";
            }
        }
        return type;
    }
    public String typeToSignature(Type element) {
        String type = "";
        if (element instanceof StringType) {
            type += "Ljava/lang/String;";
        } else if (element instanceof IntType) {
            type += "I";
        } else if (element instanceof FptrType) {
            type += "LFptr;";
        } else if (element instanceof ListType) {
            type += "Ljava/util/ArrayList;";
        } else if (element instanceof BoolType) {
            type += "Z";
        } else {
            type += "V";
        }
        return type;
    }
    public String getClass(Type element){
        String className = "";
        switch (element){
            case StringType stringType -> className += "java/lang/String";
            case IntType intType -> className += "java/lang/Integer";
            case BoolType boolType -> className += "java/lang/Boolean";
            case null -> className += "java/lang/Object";
            default -> {}
        }
        return className;
    }

    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e){
            // ignore
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e){
            // ignore
        }
    }
    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e){
            // ignore
        }
    }
    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e){
            // ignore
        }
    }
    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }
    @Override
    public String visit(Program program){
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for(String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch(ItemNotFound ignored) {}
        }

        program.getMain().accept(this);
        return null;
    }
    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        // TODO
        slots.clear();
        SymbolTable.push(new SymbolTable());
        StringBuilder commands = new StringBuilder();
        StringBuilder args = new StringBuilder("(");

        processFunctionArguments(functionDeclaration, args);
        args.append(")");
        String returnType = typeToSignature(this.curFunction.getReturnType());

        commands.append(".method public static ")
                .append(functionDeclaration.getFunctionName().getName())
                .append(args.toString())
                .append(returnType)
                .append("\n")
                .append(".limit stack 128\n")
                .append(".limit locals 128\n");

        processFunctionBody(functionDeclaration, commands);
        commands.append(".end method\n");

        addCommand(commands.toString());
        SymbolTable.pop();
        return null;
    }

    private void processFunctionBody(FunctionDeclaration functionDeclaration, StringBuilder commands) {
        boolean hasReturn = functionDeclaration.getBody().stream().anyMatch(bodyElement -> bodyElement instanceof ReturnStatement);
        for (Statement bodyElement : functionDeclaration.getBody()) {
            commands.append(bodyElement.accept(this)).append("\n");
        }
        if (!hasReturn) {
            commands.append("return\n");
        }
    }

    private void processFunctionArguments(FunctionDeclaration functionDeclaration, StringBuilder args) {
        int i = 0;
        while (i < this.curFunction.getArgumentTypes().size()) {
            args.append(typeToSignature(this.curFunction.getArgumentTypes().get(i)));
            slotOf(functionDeclaration.getArgs().get(i).getName().getName());
            VarItem newVarItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
            newVarItem.setType(this.curFunction.getArgumentTypes().get(i));
            String varName = newVarItem.getName();
            try {
                SymbolTable.top.put(newVarItem);
            } catch (ItemAlreadyExists ignored) {
                VarItem existingItem;
                try {
                    existingItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varName);
                } catch (ItemNotFound e) {
                    throw new AssertionError("Item not found despite existence check", e);
                }
                existingItem.setType(this.curFunction.getArgumentTypes().get(i));
            }
            i++;
        }
    }

    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        for (var statement : mainDeclaration.getBody())
            commands += statement.accept(this) + "\n";
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(AccessExpression accessExpression) {
        StringBuilder commands = new StringBuilder();
        if (accessExpression.isFunctionCall()) {
            return accessExpressionIsFunctionCall(accessExpression, commands);
        } else {
            return accessExpressionNotFunctionCall(accessExpression, commands);
        }
    }

    private String accessExpressionNotFunctionCall(AccessExpression accessExpression, StringBuilder commands) {
        commands.append(accessExpression.getAccessedExpression().accept(this)).append("\n");
        for (Expression expression : accessExpression.getDimentionalAccess()) {
            commands.append(expression.accept(this)).append("\n");
        }
        ListType type = (ListType) accessExpression.getAccessedExpression().accept(typeChecker);
        commands.append("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n");
        commands.append("checkcast ").append(getClass(type.getType())).append("\n");
        if (type.getType() instanceof IntType) {
            commands.append("invokevirtual java/lang/Integer/intValue()I\n");
        } else if (type.getType() instanceof BoolType) {
            commands.append("invokevirtual java/lang/Boolean/booleanValue()Z\n");
        }
        return commands.toString().trim();
    }

    private String accessExpressionIsFunctionCall(AccessExpression accessExpression, StringBuilder commands) {
        Identifier functionName = (Identifier) accessExpression.getAccessedExpression();
        String funcName;
        Type funcType = functionName.accept(typeChecker);
        FunctionItem functionItem = null;
        funcName = (funcType instanceof FptrType fptr) ? fptr.getFunctionName() : functionName.getName();
        try {
            functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + funcName);
        } catch (ItemNotFound ignored) {}

        String args = "(";
        int argCount = 0;
        Iterator<Expression> argIterator = accessExpression.getArguments().iterator();
        while (argIterator.hasNext()) {
            Expression arg = argIterator.next();
            Type argType = arg.accept(typeChecker);
            args += typeToSignature(argType);
            commands.append(arg.accept(this)).append("\n");
            argCount++;
        }

        List<Type> argumentTypes = functionItem.getArgumentTypes();
        List<Expression> defaultValues = functionItem.getFunctionDeclaration().getArgs().stream()
                .map(arg -> arg.getDefaultVal())
                .collect(Collectors.toList());
        Iterator<Type> typeIterator = argumentTypes.listIterator(argCount);
        Iterator<Expression> defaultValIterator = defaultValues.listIterator(argCount);
        while (typeIterator.hasNext() && defaultValIterator.hasNext()) {
            Type argType = typeIterator.next();
            Expression defaultValue = defaultValIterator.next();

            args += typeToSignature(argType);
            commands.append(defaultValue.accept(this)).append("\n");
        }
        args += ")";
        String returnType = typeToSignature(functionItem.getReturnType());
        commands.append("invokestatic Main/").append(funcName).append(args).append(returnType).append("\n");
        return commands.toString().trim();
    }


    @Override
    public String visit(AssignStatement assignStatement) {
        StringBuilder commands = new StringBuilder();
        Type assignValueType = assignStatement.getAssignExpression().accept(typeChecker);
        if (assignStatement.isAccessList()) {
            assignStatementIsAccessList(assignStatement, commands, assignValueType);
        } else {
            assignStatementNotAccessList(assignStatement, commands, assignValueType);
        }
        return commands.toString().trim();
    }

    private void assignStatementNotAccessList(AssignStatement assignStatement, StringBuilder commands, Type assignValueType) {
        commands.append(assignStatement.getAssignExpression().accept(this)).append("\n");
        if (assignStatement.getAssignOperator() == AssignOperator.ASSIGN) {
            assignNotAccessList(assignStatement, assignValueType, commands);
        } else {
            assignOperatorNotAccessList(assignStatement, commands);
        }
    }

    private void assignOperatorNotAccessList(AssignStatement assignStatement, StringBuilder commands) {
        commands.append("iload ").append(slotOf(assignStatement.getAssignedId().getName())).append("\n");
        if (assignStatement.getAssignOperator() == AssignOperator.PLUS_ASSIGN) {
            commands.append("iadd\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.MINUS_ASSIGN) {
            commands.append("ineg\n");
            commands.append("iadd\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.DIVIDE_ASSIGN) {
            commands.append("idiv\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.MULT_ASSIGN) {
            commands.append("imul\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.MOD_ASSIGN) {
            commands.append("irem\n");
        }
        commands.append("istore ").append(slotOf(assignStatement.getAssignedId().getName())).append("\n");
    }

    private void assignNotAccessList(AssignStatement assignStatement, Type assignValueType, StringBuilder commands) {
        VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
        newVarItem.setType(assignValueType);
        String key = VarItem.START_KEY + newVarItem.getName();
        VarItem item = null;
        try {
            item = (VarItem) SymbolTable.top.getItem(key);
        } catch (ItemNotFound ignored) {}
        if (item != null) {
            item.setType(assignValueType);
        } else {
            try {
                SymbolTable.top.put(newVarItem);
            } catch (ItemAlreadyExists ignored) {}
        }
        commands.append((assignValueType instanceof IntType || assignValueType instanceof BoolType ? "istore " : "astore "))
                .append(slotOf(assignStatement.getAssignedId().getName())).append("\n");
    }

    private void assignStatementIsAccessList(AssignStatement assignStatement, StringBuilder commands, Type assignValueType) {
        commands.append(assignStatement.getAssignedId().accept(this)).append("\n");
        commands.append(assignStatement.getAccessListExpression().accept(this)).append("\n");
        if (assignStatement.getAssignOperator() == AssignOperator.ASSIGN) {
            assignAccessList(assignStatement, commands, assignValueType);
        } else {
            assignOperatorAccessList(assignStatement, commands);
        }
    }

    private void assignAccessList(AssignStatement assignStatement, StringBuilder commands, Type assignValueType) {
        commands.append(assignStatement.getAssignExpression().accept(this)).append("\n");
        if (assignValueType instanceof IntType || assignValueType instanceof BoolType) {
            commands.append(assignValueType instanceof IntType ?
                    "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n" :
                    "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n");
        }
        commands.append("checkcast ").append(getClass(null)).append("\n");
        commands.append("invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n");
    }

    private void assignOperatorAccessList(AssignStatement assignStatement, StringBuilder commands) {
        commands.append(assignStatement.getAssignedId().accept(this)).append("\n");
        commands.append(assignStatement.getAccessListExpression().accept(this)).append("\n");
        commands.append("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n");
        commands.append("checkcast ").append(getClass(new IntType())).append("\n");
        commands.append("invokevirtual java/lang/Integer/intValue()I\n");
        commands.append(assignStatement.getAssignExpression().accept(this)).append("\n");
        if (assignStatement.getAssignOperator() == AssignOperator.PLUS_ASSIGN) {
            commands.append("iadd\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.MINUS_ASSIGN) {
            commands.append("ineg\n");
            commands.append("iadd\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.DIVIDE_ASSIGN) {
            commands.append("idiv\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.MULT_ASSIGN) {
            commands.append("imul\n");
        } else if (assignStatement.getAssignOperator() == AssignOperator.MOD_ASSIGN) {
            commands.append("irem\n");
        }
        commands.append("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n");
        commands.append("checkcast ").append(getClass(null)).append("\n");
        commands.append("invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n");
    }


    @Override
    public String visit(IfStatement ifStatement) {
        StringBuilder commands = new StringBuilder();
        processConditions(ifStatement, commands);
        String thenLabel = getFreshLabel(), elseLabel = getFreshLabel(), exitLabel = getFreshLabel();

        commands.append("ifeq ").append(elseLabel).append("\n");
        commands.append(thenLabel).append(":\n");

        processThenBody(ifStatement, commands);
        commands.append("goto ").append(exitLabel).append("\n");
        commands.append(elseLabel).append(":\n");
        processElseBody(ifStatement, commands);
        commands.append(exitLabel).append(":\n");
        return commands.toString().trim();
    }

    private void processElseBody(IfStatement ifStatement, StringBuilder commands) {
        if (ifStatement.getElseBody().isEmpty()) {
            return;
        }
        SymbolTable.push(SymbolTable.top.copy());
        Iterator<Statement> elseBodyIterator = ifStatement.getElseBody().iterator();
        while (elseBodyIterator.hasNext()) {
            Statement statement = elseBodyIterator.next();
            commands.append(statement.accept(this)).append("\n");
        }
        SymbolTable.pop();
    }

    private void processThenBody(IfStatement ifStatement, StringBuilder commands) {
        SymbolTable.push(SymbolTable.top.copy());
        Iterator<Statement> statementIterator = ifStatement.getThenBody().iterator();
        while (statementIterator.hasNext()) {
            Statement statement = statementIterator.next();
            commands.append(statement.accept(this)).append("\n");
        }
        SymbolTable.pop();
    }

    private void processConditions(IfStatement ifStatement, StringBuilder commands) {
        Iterator<Expression> conditionIterator = ifStatement.getConditions().iterator();
        while (conditionIterator.hasNext()) {
            Expression condition = conditionIterator.next();
            commands.append(condition.accept(this)).append("\n");
        }
    }


    @Override
    public String visit(PutStatement putStatement) {
        StringBuilder commands = new StringBuilder();
        commands.append("getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        commands.append(putStatement.getExpression().accept(this)).append("\n");

        Type type = putStatement.getExpression().accept(typeChecker);
        if (type instanceof IntType || type instanceof BoolType || type instanceof StringType) {
            String command = (type instanceof IntType || type instanceof BoolType) ?
                    "invokevirtual java/io/PrintStream/println(I)V" :
                    "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V";
            commands.append(command).append("\n");
        }
        return commands.toString().trim();
    }

    @Override
    public String visit(ReturnStatement returnStatement) {
        StringBuilder commands = new StringBuilder();
        Expression returnExpr = returnStatement.getReturnExp();
        if (isVoidReturn(returnExpr)) {
            commands.append("return\n");
        } else {
            Type type = returnExpr.accept(typeChecker);
            if (type instanceof NoType) {
                commands.append("return\n");
            } else {
                processReturnExpression(returnExpr, type, commands);
            }
        }
        return commands.toString().trim();
    }

    private boolean isVoidReturn(Expression returnExpr) {
        return returnExpr == null;
    }

    private void processReturnExpression(Expression returnExpr, Type type, StringBuilder commands) {
        commands.append(returnExpr.accept(this)).append("\n");
        if (type instanceof IntType || type instanceof BoolType) {
            commands.append("ireturn\n");
        } else {
            commands.append("areturn\n");
        }
    }


    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public String visit(BinaryExpression binaryExpression) {
        StringBuilder commands = new StringBuilder();
        commands.append(binaryExpression.getFirstOperand().accept(this)).append("\n");
        commands.append(binaryExpression.getSecondOperand().accept(this)).append("\n");
        Type firstOperandType = binaryExpression.getFirstOperand().accept(typeChecker);
        if (binaryExpression.getOperator() == BinaryOperator.PLUS ||
                binaryExpression.getOperator() == BinaryOperator.MINUS ||
                binaryExpression.getOperator() == BinaryOperator.MULT ||
                binaryExpression.getOperator() == BinaryOperator.DIVIDE) {
            binaryExpressionNotArithmeticOperator(binaryExpression, commands);
        } else {
            binaryExpressionIsArithmeticOperator(binaryExpression, commands, firstOperandType);
        }
        return commands.toString().trim();
    }

    private void binaryExpressionNotArithmeticOperator(BinaryExpression binaryExpression, StringBuilder commands) {
        BinaryOperator operator = binaryExpression.getOperator();
        if (operator == BinaryOperator.PLUS) {
            commands.append("iadd\n");
        } else if (operator == BinaryOperator.MINUS) {
            commands.append("isub\n");
        } else if (operator == BinaryOperator.MULT) {
            commands.append("imul\n");
        } else if (operator == BinaryOperator.DIVIDE) {
            commands.append("idiv\n");
        }
    }

    private void binaryExpressionIsArithmeticOperator(BinaryExpression binaryExpression, StringBuilder commands, Type firstOperandType) {
        String enterLabel = getFreshLabel(), exitLabel = getFreshLabel();
        BinaryOperator operator = binaryExpression.getOperator();
        if (operator == BinaryOperator.EQUAL) {
            commands.append((firstOperandType instanceof IntType || firstOperandType instanceof BoolType) ?
                    "if_icmpeq " + enterLabel + "\n" :
                    "if_acmpeq " + enterLabel + "\n");
        } else if (operator == BinaryOperator.NOT_EQUAL) {
            commands.append((firstOperandType instanceof IntType || firstOperandType instanceof BoolType) ?
                    "if_icmpne " + enterLabel + "\n" :
                    "if_acmpne " + enterLabel + "\n");
        } else if (operator == BinaryOperator.GREATER_THAN) {
            commands.append("if_icmpgt " + enterLabel + "\n");
        } else if (operator == BinaryOperator.LESS_THAN) {
            commands.append("if_icmplt " + enterLabel + "\n");
        } else if (operator == BinaryOperator.GREATER_EQUAL_THAN) {
            commands.append("if_icmpge " + enterLabel + "\n");
        } else if (operator == BinaryOperator.LESS_EQUAL_THAN) {
            commands.append("if_icmple " + enterLabel + "\n");
        }
        commands.append("ldc 0\n");
        commands.append("goto ").append(exitLabel).append("\n");
        commands.append(enterLabel).append(":\n");
        commands.append("ldc 1\n");
        commands.append(exitLabel).append(":\n");
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        StringBuilder commands = new StringBuilder();
        commands.append(unaryExpression.getExpression().accept(this)).append("\n");
        if (unaryExpression.getOperator() == UnaryOperator.MINUS) {
            commands.append("ineg\n");
        } else if (unaryExpression.getOperator() == UnaryOperator.NOT) {
            commands.append("ldc 1\n");
            commands.append("ixor\n");
        } else if (unaryExpression.getOperator() == UnaryOperator.INC || unaryExpression.getOperator() == UnaryOperator.DEC) {
            processIncDec(unaryExpression, commands);
        }
        return commands.toString().trim();
    }

    private void processIncDec(UnaryExpression unaryExpression, StringBuilder commands) {
        commands.append("ldc 1\n");
        commands.append("iadd\n");
        if (unaryExpression.getExpression() instanceof Identifier identifier) {
            commands.append("istore ").append(slotOf(identifier.getName())).append("\n");
        }
    }

    @Override
    public String visit(Identifier identifier) {
        Type type = identifier.accept(typeChecker);
        return generateCommand(identifier, type);
    }

    private String generateCommand(Identifier identifier, Type type) {
        if (type instanceof IntType || type instanceof BoolType) {
            return "iload " + slotOf(identifier.getName());
        } else if (type instanceof FptrType fptr) {
            return generateFptrCommand(fptr);
        } else {
            return "aload " + slotOf(identifier.getName());
        }
    }

    private String generateFptrCommand(FptrType fptr) {
        StringBuilder commands = new StringBuilder();
        commands.append("new Fptr\n");
        commands.append("dup\n");
        commands.append("aload_0\n");
        commands.append("ldc \"").append(fptr.getFunctionName()).append("\"\n");
        commands.append("invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n");
        return commands.toString();
    }

    @Override
    public String visit(LoopDoStatement loopDoStatement) {
        StringBuilder commands = new StringBuilder();
        String startLabel = getFreshLabel();
        String endLabel = getFreshLabel();

        setupLoopLabels(startLabel, endLabel);
        commands.append(startLabel).append(":\n");

        SymbolTable.push(SymbolTable.top.copy());
        processLoopBody(loopDoStatement, commands);
        SymbolTable.pop();

        commands.append("goto ").append(startLabel).append("\n");
        commands.append(endLabel).append(":\n");

        cleanupLoopLabels();

        return commands.toString().trim();
    }

    private void setupLoopLabels(String startLabel, String endLabel) {
        endPoints.add(endLabel);
        startPoints.add(startLabel);
    }

    private void cleanupLoopLabels() {
        endPoints.removeLast();
        startPoints.removeLast();
    }

    private void processLoopBody(LoopDoStatement loopDoStatement, StringBuilder commands) {
        Iterator<Statement> statementIterator = loopDoStatement.getLoopBodyStmts().iterator();
        while (statementIterator.hasNext()) {
            Statement statement = statementIterator.next();
            commands.append(statement.accept(this)).append("\n");
        }
    }

    @Override
    public String visit(BreakStatement breakStatement){
        //TODO
        return "goto " + endPoints.getLast();
    }
    @Override
    public String visit(NextStatement nextStatement){
        //TODO
        return "goto " + startPoints.getLast();
    }
    @Override
    public String visit(LenStatement lenStatement) {
        StringBuilder commands = new StringBuilder();
        commands.append(lenStatement.getExpression().accept(this)).append("\n");
        commands.append((lenStatement.getExpression().accept(typeChecker) instanceof ListType) ?
                "invokevirtual java/util/ArrayList/size()I" :
                "invokevirtual java/lang/String/length()I").append("\n");
        return commands.toString().trim();
    }

    @Override
    public String visit(ChopStatement chopStatement) {
        StringBuilder commands = new StringBuilder();
        commands.append(chopStatement.getChopExpression().accept(this)).append("\n");
        commands.append("dup\n");
        commands.append("invokevirtual java/lang/String/length()I\n");
        commands.append("ldc -1\n");
        commands.append("iadd\n");
        commands.append("ldc 0\n");
        commands.append("swap\n");
        commands.append("invokevirtual java/lang/String/substring(II)Ljava/lang/String;\n");
        return commands.toString().trim();
    }

    @Override
    public String visit(FunctionPointer functionPointer){
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }

    @Override
    public String visit(ListValue listValue) {
        StringBuilder commands = new StringBuilder();
        commands.append("new java/util/ArrayList\n");
        commands.append("dup\n");
        commands.append("invokespecial java/util/ArrayList/<init>()V\n");
        commands.append("astore ").append(slotOf("_array_")).append("\n");
        Iterator<Expression> iterator = listValue.getElements().iterator();
        while (iterator.hasNext()) {
            Expression expression = iterator.next();
            commands.append("aload ").append(slotOf("_array_")).append("\n");
            commands.append(expression.accept(this)).append("\n");
            Type type = expression.accept(typeChecker);
            if (type instanceof IntType) {
                commands.append("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n");
            } else if (type instanceof BoolType) {
                commands.append("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n");
            }
            commands.append("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n");
            commands.append("pop\n");
        }
        commands.append("aload ").append(slotOf("_array_")).append("\n");
        return commands.toString().trim();
    }

    @Override
    public String visit(IntValue intValue){
        //TODO, use "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer" to convert to primitive
        return "ldc " + intValue.getIntVal();
    }
    @Override
    public String visit(BoolValue boolValue){
        //TODO
        return "ldc " + (boolValue.getBool() ? 1 : 0);
    }
    @Override
    public String visit(StringValue stringValue) {
        //TODO
        StringBuilder commands = new StringBuilder();
        commands.append("ldc ").append(stringValue.getStr());
        return commands.toString().trim();
    }
}