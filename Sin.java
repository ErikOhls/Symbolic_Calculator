import java.lang.Math;
import java.util.HashMap;

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

    public Sexpr eval(HashMap<String, Sexpr> variabel){
        argument = this.argument.eval(variabel);
        return Symbolic.sin(argument);
    }


    public int priority(){
        return 2;
    }
}
