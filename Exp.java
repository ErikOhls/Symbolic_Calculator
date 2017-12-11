import java.lang.Math;
import java.util.HashMap;
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

    public Sexpr eval(HashMap<String, Sexpr> variabel){
        this.argument = this.argument.eval(variabel);
        return Symbolic.exp(argument);
    }

    public int priority(){
        return 2;
    }
}
