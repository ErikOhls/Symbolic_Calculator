package symbolic;

public abstract class Binary extends Sexpr {

    public Sexpr left;
    public Sexpr right;

    public Binary(Sexpr argLeft, Sexpr argRight){
        this.left = argLeft;
        this.right = argRight;
    }

    public String toString(){
        return left.toString() + getName() + right.toString();
    }
}
