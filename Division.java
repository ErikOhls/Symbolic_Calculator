import java.util.HashMap;
public class Division extends Binary {

    public Division(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "/";
    }

    public Sexpr eval(HashMap<String,Sexpr> variabel){
   	left = this.left.eval(variabel);
   	right = this.right.eval(variabel);
    return Symbolic.division(left, right);
    }

    public int priority(){
        return 3;
    }
}
