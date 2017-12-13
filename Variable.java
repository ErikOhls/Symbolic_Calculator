import java.util.HashMap;
public class Variable extends Atom{

    public String ident;

    /**
     * Constructor
     *
     * @param ident
     */
    public Variable(String ident){
        this.ident = ident;
    }
    /**
     * Assignes variables
     *
     * @param variable
     * @return Complete parsed Sexpr of user input or instance of quit/vars
     */
    public Sexpr eval(HashMap<String, Sexpr> variable) {
        if(variable.containsKey(ident)) return variable.get(ident);
        else {return this;}
    }

    public String getName(){
        return ident;
    }

    public boolean isVariable() {
        return true; 

    }
}
