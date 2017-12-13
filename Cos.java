import java.util.HashMap;
import java.lang.Math;

public class Cos extends Unary{

    /**
     * Constructor
     *
     * @param arg
     */
    public Cos(Sexpr arg){
        super(arg);
    }
    /**
     * evaluates user input and converts it to a Symbolic expression(Sexpr).
     *
     * @param variabel
     * @return evaluated Sexpr of user input or instance of cos
     */
    public Sexpr eval(HashMap<String, Sexpr>variabel) {
        this.argument = this.argument.eval(variabel);
        return Symbolic.cos(argument);

    }

    public String getName(){
        return "Cos";
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
