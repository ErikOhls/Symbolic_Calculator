import java.util.HashMap;
import java.util.Map;
public class Subtraction extends Binary {

/**
  * Constructor
  *
  * @param argLeft
  * @param argRight
  */
    public Subtraction(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "-";
    }
/**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr)
     *
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of subtraction
     */
    public Sexpr eval(HashMap<String,Sexpr> variabel){
  	left = this.left.eval(variabel);
   	right = this.right.eval(variabel);
   	return Symbolic.subtraction(left, right);
   }

/**
     * to access the number of priority
     *
     * @return the number of priority
     */
     public int priority(){
    	return 4;
    }

    
}

