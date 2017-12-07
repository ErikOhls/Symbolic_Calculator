import java.util.HashMap;
import java.lang.Math;

public class Cos extends Unary{

    public Sexpr argument;

    public Cos(Sexpr arg){
        super(arg);
    }

    public Sexpr eval(HashMap<String, Sexpr>variabel) {
        this.argument = this.argument.eval(variabel);
        return Symbolic.cos(argument);

     }

    public String getName(){
        return "Cos";
    }


    public int priority(){
        return 2;
    }

}
