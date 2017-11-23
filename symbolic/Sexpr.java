package symbolic;
import java.util.HashMap;
import java.util.Map;

public abstract class Sexpr {

    public Sexpr expression;
    public HashMap<String, Sexpr> map;

    public Sexpr(){
    }

    public String eval(Map variables){
        return "TODO";
    }

    public double getValue(){
        return 0;
    }

    public boolean isConstant(){
        return false;
    }

    public String getName(){
        return "nu blev de tokigt!";
    }

}
