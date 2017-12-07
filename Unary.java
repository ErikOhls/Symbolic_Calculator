import java.util.HashMap;
public abstract class Unary extends Sexpr {

    public Sexpr argument;

    public Unary(Sexpr arg){
        this.argument = arg;
    }

    public String toString(){
        return getName() + "(" + argument.toString() + ")";
    }
}
