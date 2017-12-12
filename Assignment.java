import java.util.HashMap;
public class Assignment extends Binary{

    public Assignment(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
    	return "=";
    }

   public Sexpr eval(HashMap<String,Sexpr> variabel){
      Sexpr left = this.left.eval(variabel);

    /*    //this.right.getName();
        Sexpr assignment = Symbolic.assignment(this.left.eval(variabel), this.right);
        String character = "" + this.right();
        if (variabel.containsKey(this.right.getName())){
            variabel.remove(this.right.getName());
    */
        variabel.put(this.right.getName(), left);
        return left;
    }


    public int priority(){
        return 5;
    }

}
