public class Symbolic {
    public Sexpr expression;

    public static Sexpr sin(Sexpr arg) {
        if (arg.isConstant()) {
            return new Constant(Math.sin(arg.getValue()));
        } else {
            return new Sin(arg);
        }
    }

    public static Sexpr cos(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(Math.sin(arg.getValue()));
        } else {
            return new Cos(arg);
        }
    }

    public static Sexpr exp(Sexpr arg) {
        if (arg.isConstant()) {
            return new Constant(Math.exp(arg.getValue()));
        } else {
            return new Exp(arg);
        }
    }

    public static Sexpr log(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(Math.log(arg.getValue()));
        } else {
            return new Log(arg);
        }
    }

    public static Sexpr negation(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(-1 * (arg.getValue()));
        } else {
            return new Negation(arg);
        }
    }
    
    public static Sexpr addition(Sexpr argLeft, Sexpr argRight){
        if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) + (argRight.getValue()));
        }
        else {
            return new Addition(argLeft, argRight);
        }
     }

    public static Sexpr subtraction(Sexpr argLeft, Sexpr argRight){
        if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) - (argRight.getValue()));
        }
        else {
            return new Subtraction(argLeft, argRight);
        }
     }

    public static Sexpr multiplication(Sexpr argLeft, Sexpr argRight) {
        if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) * (argRight.getValue()));
        }
        else {
            return new Multiplication(argLeft, argRight);
        }
     }

    public static Sexpr division(Sexpr argLeft, Sexpr argRight) {
        if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) / (argRight.getValue()));
        }
        else {
            return new Division(argLeft, argRight);
        }
     }

    public static Sexpr assignment(Sexpr argLeft, Sexpr argRight) {
        if (argLeft.isConstant()) {
            argRight = argLeft;
            return new Constant(argRight.getValue());
        }
        else {
            return new Assignment(argLeft, argRight);
        }
     }

   
}
