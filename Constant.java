public class Constant extends Atom{

    public double value;

    public Constant(double value){
        this.value = value;
    }

    public String getName(){
        return "var";
    }

    public double getValue(){
        return this.value;
    }

    public boolean isConstant(){
        return true;
    }

    public String toString(){
        return "" + this.value;
    }
}

