import java.util.Map;
public class Symbolic {
    public Sexpr expression;

/**
     * Calculates the Sinus of a Symbolic expression(Sexpr)
     *
     * @param arg
     * @return new Constant; else a new instance of Sin
     */
    public static Sexpr sin(Sexpr arg) {
        if (arg.isConstant()) {
            return new Constant(Math.sin(arg.getValue()));
        } else {
            return new Sin(arg);
        }
    }

/**
     * Calculates the Cosine of a Symbolic expression(Sexpr)
     *
     * @param arg
     * @return new Constant; else a new instance of Cos
     */
    public static Sexpr cos(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(Math.sin(arg.getValue()));
        } else {
            return new Cos(arg);
        }
    }

/**
     * Exponential calculation on a Symbolic expression(Sexpr) 
     *
     * @param arg
     * @return new Constant; else a new instance of Exp
     */
    public static Sexpr exp(Sexpr arg) {
        if (arg.isConstant()) {
            return new Constant(Math.exp(arg.getValue()));
        } else {
            return new Exp(arg);
        }
    }

/**
     * Logarithms a Symbolic expression(Sexpr)
     *
     * @param arg
     * @return new Constant; else a new instance of Log
     */
    public static Sexpr log(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(Math.log(arg.getValue()));
        } else {
            return new Log(arg);
        }
    }

/**
     * Negate a Symbolic expression(Sexpr)
     *
     * @param <arg>
     * @return new Constant; else a new instance of Negation
     */
    public static Sexpr negation(Sexpr arg) {
        if (arg.isConstant()){
            return new Constant(-1 * (arg.getValue()));
        } else {
            return new Negation(arg);
        }
    }

/**
     * Add two Symbolic expressions(Sexpr) 
     *
     * @param argLeft
     * @param argRight
     * @return new Constant; else a new instance of Addition
     */    
    public static Sexpr addition(Sexpr argLeft, Sexpr argRight){
        if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) + (argRight.getValue()));
        }
        else {
            return new Addition(argLeft, argRight);
        }
     }

/**
     * Subtract two Symbolic expressions(Sexpr)
     *
     * @param argLeft 
     * @param argRight
     * @return new Constant; else a new instance of Subtraction
     */
    public static Sexpr subtraction(Sexpr argLeft, Sexpr argRight){
        if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) - (argRight.getValue()));
        }
        else {
            return new Subtraction(argLeft, argRight);
        }
     }

/**
     * Multiplicates two Symbolic expressions(Sexpr)
     *
     * @param argLeft
     * @param argRight
     * @return new Constant; else a new instance of Multiplication
     */

    public static Sexpr multiplication(Sexpr argLeft, Sexpr argRight) {
        if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) * (argRight.getValue()));
        }
        else {
            return new Multiplication(argLeft, argRight);
        }
     }

/**
     * Divides two Symbolic expressions(Sexpr) 
     *
     * @param argLeft
     *@param argRight
     * @return new Constant; else a new instance of Division
     */

    public static Sexpr division(Sexpr argLeft, Sexpr argRight) { 
       if (argLeft.isConstant() && argRight.isConstant()){
            return new Constant((argLeft.getValue()) / (argRight.getValue()));
        }
        else {
            return new Division(argLeft, argRight);
        }
     }
   
}
