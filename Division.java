public class Division extends Binary {
    public Division(Sexpr argLeft, Sexpr argRight){
        super(argLeft, argRight);
    }

    public String getName(){
        return "/";
    }
}
