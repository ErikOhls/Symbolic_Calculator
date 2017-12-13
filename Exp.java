import java.lang.Math;
import java.util.HashMap;
public class Exp extends Unary {
  
/**
    * Constructor
    *
    * @param arg
    */
    public Exp(Sexpr arg){
        super(arg);
    }

    public String getName(){
        return "Exp";
    
/**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr)
     *
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of exp
     */

    public Sexpr eval(HashMap<String, Sexpr> variabel){
        this.argument = this.argument.eval(variabel);
        return Symbolic.exp(argument);
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
