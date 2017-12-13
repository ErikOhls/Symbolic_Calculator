import java.lang.Math;
import java.util.HashMap;

public class Negation extends Unary{


    /**
     * Constructor
     *
     * @param arg
     */
    public Negation(Sexpr arg){
        super(arg);
    }

    public String getName(){
        return "Negation";
    }
    /**
     * Evaluated input and converts it to a Symbolic expression(Sexpr)
     *
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of negation
     */
    public Sexpr eval(HashMap<String,Sexpr> variabel){
        argument = this.argument.eval(variabel);
        return Symbolic.negation(argument);
    }

    /**
     * to access the number of priority
     *
     * @return the number of priority
     */
    public int priority(){
        return 5;
    }


}
