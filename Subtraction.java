public class Subtraction extends Binary {
    public Subtraction(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        this.priority = 3;
    }

    public String getName(){
        return "-";
    }
    
}

