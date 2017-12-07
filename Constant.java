import java.util.HashMap;
public class Constant extends Atom{

    public double value;

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

<<<<<<< HEAD
    public Sexpr eval(HashMap<String, Sexpr> variabel){
        argument = this.argument.eval(variabel);
        return Symbolic.constant(argument);
=======
    public String toString(){
        return "" + this.value;
>>>>>>> e21208b0fa0120a3c2f5431ab4af68394e744417
    }
}

