import java.util.HashMap;
public class Addition extends Binary {
 
 /**
    * Constructor
    *
    * @param argLeft
    * @param argRight
    */  
    public Addition(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

/**
     * to access the name
     *
     * @return the name
     */
    public String getName(){
        return "+";
    }

/**
     * to access the number of priority
     *
     * @return the number of priority
     */
    public int priority(){
    	return 4;
    }
/**
     * Evaluates a Symbolic expression(Sexpr).
     * 
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of addition
     */
    public Sexpr eval (HashMap<String,Sexpr> variabel){
     	left = this.left.eval(variabel);
    	right = this.right.eval(variabel);
    	return Symbolic.addition(left, right);
    }
}
