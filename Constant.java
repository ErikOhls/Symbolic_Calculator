import java.util.HashMap;
public class Constant extends Atom{

    public double value;
/**
    * Constructor
    *
    * @param value
    */
    public Constant(double value){
        this.value = value;
    }

    public String getName(){
        return "var";
    }

    public double getValue(){
        return this.value;
    }

    public boolean isConstant(){
        return true;
    }

    public Sexpr eval(HashMap<String, Sexpr> variabel){
        return this;
    }
    public String toString(){
        return "" + this.value;
    }
}

