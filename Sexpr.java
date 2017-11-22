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

    public double getValue(){ // Detta är lite tokigt?
        return this.getValue();
        // return (Constant) this.expression.getValue(); ?
    }

    public boolean isConstant(){
        if (this.expression == (Constant)expression){
            return expression.isConstant(); //isConstant Sexpr eller Constant?
        } else return false;
    }
}
