public class Subtraction extends Binary {
    public Subtraction(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "-";
    }
}
