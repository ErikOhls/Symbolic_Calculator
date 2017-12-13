import java.util.HashMap;
public class Assignment extends Binary{

    /**
     * Constructor
     *
     * @param argLeft
     * @param argRight
     */
    public Assignment(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }
    /**
     * to access the name
     *
     * @return the name
     */
    public String getName(){
        return "=";
    }
    /**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr) and assigns the right variable to the left value.
     * 
     * @param variabel
     * @return evaluated Sexpr of user input
     */
    public Sexpr eval(HashMap<String,Sexpr> variabel){
        Sexpr left = this.left.eval(variabel);

        variabel.put(this.right.getName(), left);
        return left;
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
