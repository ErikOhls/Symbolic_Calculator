import java.lang.Math;
import java.util.HashMap;

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

    public Sexpr eval(HashMap<String,Sexpr> variabel){
        argument = this.argument.eval(variabel);
        return Symbolic.negation(argument);
    }


    public int priority(){
        return 5;
    }


}
