package symbolic;
import java.lang.Math;

public class Sin extends Unary {

    public Sexpr argument;

    public static Sexpr sin(Sexpr arg){
        /*
        if (arg.isConstant()) {
            return new Constant(Math.sin(arg.getValue()));
        } else { //Det här makes no sense?
            return new Sin(arg);
        }
        */
        return arg;
    }
}
