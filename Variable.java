import java.util.HashMap;
public class Variable extends Atom{

	public String ident;

	public Variable(String ident){
      this.ident = ident;
	}

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
