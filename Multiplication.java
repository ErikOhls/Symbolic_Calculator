public class Multiplication extends Binary {
    public Multiplication(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "*";
    }
}
