import java.util.HashMap;
public class Division extends Binary {

/**
    * Constructor
    *
    * @param argLeft
    * @param argRight
    */
    public Division(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "/";
    }
/**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr) 
     *
     * @param variabel
     * @return Evaluated Sexpr of user input or instance of division
     */
    public Sexpr eval(HashMap<String,Sexpr> variabel){
   	left = this.left.eval(variabel);
   	right = this.right.eval(variabel);
    return Symbolic.division(left, right);
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
