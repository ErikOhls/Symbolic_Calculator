public abstract class Atom extends Sexpr {


    public Sexpr argument;

    public Atom(){
    }

    public String toString(){
        return this.argument.toString();
    }
}

