package symbolic;

public abstract class Atom extends Sexpr {

    public Sexpr argument;

    public Atom(Sexpr argument){
        this.argument = argument;
    }

    // Kan inte komma åt Constant ifrån SymbCalc?
    public class Constant{

        public double value;

        public Constant(double value){
            this.value = value;
        }

        public String getName(){
            return "TODO";
        }

        public double getValue(){
            return this.value;
        }

        public boolean isConstant(){
            //TODO
            return true;
        }
    }

    public String toString(){
        return this.argument.toString();
    }
}
