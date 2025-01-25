package main.compileError.typeErrors;

import lombok.Getter;
import main.compileError.CompileError;
import java.util.Objects;


@Getter
public class FunctionIncompatibleReturnTypes extends CompileError {
    private final String functionName;
    public FunctionIncompatibleReturnTypes(int line, String functionName){
        this.line = line;
        this.functionName = functionName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FunctionIncompatibleReturnTypes other = (FunctionIncompatibleReturnTypes) obj;
        return Objects.equals(functionName, other.functionName);
    }
    public String getErrorMessage(){return "Line:" + this.line + "-> types of return expressions of the function `" + this.functionName + "` must be the same";}
}
