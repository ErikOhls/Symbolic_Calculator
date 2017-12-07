import java.util.HashMap;
import java.util.Map;
public class Multiplication extends Binary {
    public Multiplication(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        
    }

    public String getName(){
        return "*";
    }

    public Sexpr eval(HashMap<String,Sexpr> variabel){
 	left = this.left.eval(variabel);
   	right = this.right.eval(variabel);
   	return Symbolic.multiplication(left, right);
   }

     public int priority(){
        return 3;
    }
}
