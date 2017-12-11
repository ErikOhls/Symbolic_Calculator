import java.util.HashMap;
import java.util.Map;
public class Subtraction extends Binary {

    public Subtraction(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "-";
    }

    public Sexpr eval(HashMap<String,Sexpr> variabel){
  	left = this.left.eval(variabel);
   	right = this.right.eval(variabel);
   	return Symbolic.subtraction(left, right);
   }

     public int priority(){
    	return 4;
    }

    
}

