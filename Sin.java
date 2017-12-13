import java.lang.Math;
import java.util.HashMap;

public class Sin extends Unary {

/**
    * Constructor
    *
    * @param arg
    */
    public Sin(Sexpr arg){
        super(arg);
    }

    public String getName(){
        return "Sin";
    }
/**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr)
     *
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of sin
     */
    public Sexpr eval(HashMap<String, Sexpr> variabel){
        argument = this.argument.eval(variabel);
        return Symbolic.sin(argument);
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
