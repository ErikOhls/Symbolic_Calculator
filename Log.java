import java.lang.Math;
import java.util.HashMap;
public class Log extends Unary{

    public Sexpr argument;
/**
    * Constructor
    *
    * @param arg
    */
    public Log(Sexpr arg){
        super(arg);
    }

    public String getName(){
        return "Log";
    }
/**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr)
     *
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of log
     */
    public Sexpr eval(HashMap<String, Sexpr> variabel){
        argument = this.argument.eval(variabel);
        return Symbolic.log(argument);
    }

/**
     * to access the number of priority
     *
     * @return the number of priority
     */
    public int priority(){
        return 2;
    }
}
