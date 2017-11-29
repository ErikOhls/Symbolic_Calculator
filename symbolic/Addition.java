//package symbolic;

public class Addition extends Binary {
    public Addition(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }
    
    public String getName(){
        return "+";
    }
}
