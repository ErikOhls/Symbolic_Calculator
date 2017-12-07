import java.util.HashMap;
public class Assignment extends Binary{
	public Assignment(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        this.priority = 4;
    }

    public String getName(){
    	return "=";
    }

   public Sexpr eval(HashMap<String,Sexpr> variabel){
        left = this.left.eval(variabel);
        right = this.right.eval(variabel);
        return Symbolic.assignment(left, right);
    }


    public int priority(){
        return 5;
    }

}
