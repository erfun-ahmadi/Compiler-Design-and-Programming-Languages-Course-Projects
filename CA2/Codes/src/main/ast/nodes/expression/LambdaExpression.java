package main.ast.nodes.expression;

import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class LambdaExpression extends Expression{
    ArrayList<VarDeclaration> declarationArgs = new ArrayList<>();
    ArrayList<Statement> body = new ArrayList<>();
    public boolean isNumOfArgsOk(int argsNum) {
        int maxValidArgsNum = declarationArgs.size();
        int minValidArgsNum = 0;
        for (VarDeclaration varDec : declarationArgs) {
            if (varDec.getDefaultVal() == null) minValidArgsNum ++;
        }

        return argsNum <= maxValidArgsNum && argsNum >= minValidArgsNum;
    }
    public LambdaExpression(ArrayList<VarDeclaration> declarationArgs, ArrayList<Statement> body
                            ){
        this.declarationArgs = declarationArgs;
        this.body = body;
    }
    public void setBody(ArrayList<Statement> body) {
        this.body = body;
    }

    public void setDeclarationArgs(ArrayList<VarDeclaration> declarationArgs) {
        this.declarationArgs = declarationArgs;
    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public ArrayList<VarDeclaration> getDeclarationArgs() {
        return declarationArgs;
    }
    @Override
    public String toString(){return "LambdaExpression";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
