import java.util.HashMap;
import java.util.Map;
public class Subtraction extends Binary {

    public Subtraction(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        this.priority = 3;
    }

    public String getName(){
        return "-";
    }
<<<<<<< HEAD

    public Sexpr eval(HashMap<String,Sexpr> variabel){
  	left = this.left.eval(variabel);
   	right = this.right.eval(variabel);
   	return Symbolic.subtraction(left, right);
   }

     public int priority(){
    	return 4;
    }
}
=======
    
}

>>>>>>> e21208b0fa0120a3c2f5431ab4af68394e744417
