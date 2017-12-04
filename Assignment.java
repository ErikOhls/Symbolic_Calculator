public class Assignment extends Binary{
	public Assignment(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
    	return "=";
    }
}
