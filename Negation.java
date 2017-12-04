import java.lang.Math;

public class Negation extends Unary{

    public Sexpr argument;

    public Negation(Sexpr arg){
        super(arg);
    }

    public static Sexpr negation(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(-1 * (arg.getValue()));
        } else {
            return new Negation(arg);
        }
    }

    public String getName(){
        return "Negation";
    }
}
