public class Addition extends Binary {
   
    public Addition(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        this.priority = 3;
    }

    public String getName(){
        return "+";
    }
}
