import java.util.*;

public class Quit extends Command{
    public static final Quit instance = new Quit();

    private Quit(){
    }

    public static Quit getInstance(){
        return instance;
    }

    public Boolean isQuit(){
        return true;
    }

    public String getName(){
        return null;
    }
    /**
     * Evaluates user input and converts it to a Symbolic expression(Sexpr).
     * 
     * @param variables
     * @return null
     */
    public Sexpr eval(HashMap<String, Sexpr> variables){
        return null;
    }
}
