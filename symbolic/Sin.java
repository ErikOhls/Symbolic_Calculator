package symbolic;
import java.lang.Math;

public class Sin extends Unary {

    public Sin(Sexpr arg){
        super(arg);
    }

    public static Sexpr sin(Sexpr arg) {
        if (arg.isConstant()) {
            return new Constant(Math.sin(arg.getValue()));
        } else {
            return new Sin(arg);
        }
    }

    public String getName(){
        return "Sin";
    }
}
