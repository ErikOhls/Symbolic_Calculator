import java.util.HashMap;
public class Addition extends Binary {
   
    public Addition(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "+";
    }

    public int priority(){
    	return 4;
    }

    public Sexpr eval (HashMap<String,Sexpr> variabel){
    	left = this.left.eval(variabel);
    	right = this.right.eval(variabel);
    	return Symbolic.addition(left, right);
    }
}
