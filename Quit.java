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

    public Sexpr eval(HashMap<String, Sexpr> variables){
        return null;
    }
}
