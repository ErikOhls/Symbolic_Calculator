package symbolic;

public class Constant extends Atom{

    public double value;

    public Constant(double value){
        this.value = value;
    }

    // Get name till vad?
    public String getName(){
        return "var";
    }

    public double getValue(){
        return this.value;
    }

    public boolean isConstant(){
        return true;
    }
}

