package symbolic;

public class Subtraction extends Binary {
    public Subtracion(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "-";
    }
}
