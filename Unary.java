package symbolic;

public abstract class Unary extends Sexpr {

    public Sexpr argument;

    public Unary(){
    }

    public String toString(){
        return this.argument.toString();
    }
}
