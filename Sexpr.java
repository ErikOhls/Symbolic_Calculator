import java.util.HashMap;
import java.util.Map;

public abstract class Sexpr {

    public Sexpr expression;
    public HashMap<String, Sexpr> map;
    protected int priority;

    public Sexpr(){
    }

    public abstract Sexpr eval(HashMap<String, Sexpr> variables);
    /**
     * to access the value
     *
     * @return the current value
     */
    public double getValue(){
        return 0;
    }

    public boolean isConstant(){
        return false;
    }
    /**
     * to access the name
     *
     * @return the current name
     */
    public String getName(){
        return "nu blev de tokigt!";
    }

    public Boolean isQuit(){
        return false;
    }

    public Boolean isVars(){
        return false;
    }

}
