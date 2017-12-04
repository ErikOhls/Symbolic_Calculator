public class Multiplication extends Binary {
    public Multiplication(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        this.priority = 2;
    }

    public String getName(){
        return "*";
    }
}
