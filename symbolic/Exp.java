package symbolic;
import java.lang.Math;

public class Exp extends Unary {
    public Exp(Sexpr arg){
        super(arg);
    }

    public static Sexpr exp(Sexpr arg) {
        if (arg.isConstant()) {
            return new Constant(Math.exp(arg.getValue()));
        } else {
            return new Exp(arg);
        }
    }

    public String getName(){
        return "Exp";
    }
}
