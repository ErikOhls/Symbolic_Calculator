import java.lang.Math;

public class Log extends Unary{

    public Sexpr argument;

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
}
