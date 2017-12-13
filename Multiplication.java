import java.util.HashMap;
import java.util.Map;
public class Multiplication extends Binary {
 
    /**
     * Constructor
     *
     * @param argLeft
     * @param argRight
     */
    public Multiplication(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        
    }

    public String getName(){
        return "*";
    }
    /**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr)
     *
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of multiplication
     */
    public Sexpr eval(HashMap<String,Sexpr> variabel){
 	      left = this.left.eval(variabel);
   	    right = this.right.eval(variabel);
   	    return Symbolic.multiplication(left, right);
    }
    /**
     * to access the number of priority
     *
     * @return the number of priority
     */
    public int priority(){
        return 3;
    }
}
