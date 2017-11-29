//package symbolic;
import java.lang.Math;

public class Cos extends Unary{

    public Sexpr argument;

    public Cos(Sexpr arg){
        super(arg);
    }

    public static Sexpr cos(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(Math.sin(arg.getValue()));
        } else {
            return new Cos(arg);
        }
    }

    public String getName(){
        return "Cos";
    }
}
