public class Assignment extends Binary{
	public Assignment(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        this.priority = 4;
    }

    public String getName(){
    	return "=";
    }
}
