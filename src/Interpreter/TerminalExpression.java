package Interpreter;

/**
 * @author KIKOFranklin
 * @create 2021/4/5 0005 17:18
 */
public class Interpreter implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
