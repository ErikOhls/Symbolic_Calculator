import java.lang.Math;
import java.util.HashMap;
public class Log extends Unary{

    public Log(Sexpr arg){
        super(arg);
    }

    public static Sexpr log(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(Math.log(arg.getValue()));
        } else {
            return new Log(arg);
        }
    }

    public String getName(){
        return "Log";
    }

    public Sexpr eval(HashMap<String, Sexpr> variabel){
        argument = this.argument.eval(variabel);
        return Symbolic.log(argument);
    }


    public int priority(){
        return 2;
    }
}
