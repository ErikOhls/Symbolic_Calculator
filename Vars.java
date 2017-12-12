import java.util.*;

public class Vars extends Command{
    public static final Vars instance = new Vars();

    private Vars(){
    }

    public static Vars getInstance(){
        return instance;
    }

    public Boolean isVars(){
        return true;
    }

    public String getName(){
        return null;
    }

    public Sexpr eval(HashMap<String, Sexpr> variables){
        return null;
    }
}
