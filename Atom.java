package symbolic;

public abstract class Atom extends Sexpr {

    public Sexpr argument;

    public Atom(Sexpr argument){
        this.argument = argument;
    }

    public String toString(){
        return this.toString.argument;
    }
}
