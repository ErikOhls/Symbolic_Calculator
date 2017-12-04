public class Division extends Binary {
    public Division(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
        this.priority = 2;
    }

    public String getName(){
        return "/";
    }
}
