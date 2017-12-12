import java.util.HashMap;
import java.util.Map;

public class SymbCalc {

    public static void main(String[] args) {

        Parser p = new Parser();

        HashMap<String,Sexpr> variables = new HashMap<String,Sexpr>();

        while (true)
            try {
                System.out.print("? ");
                Sexpr e = p.statement();
                if (e.isQuit()){
                    System.out.println("Closing down calculator");
                    return;
                }
                if (e.isVars()){
                    System.out.println("Variables goes here!");
                }
                System.out.println("Inläst uttryck: " + e + "\n");  // För kontroll
                System.out.println("Resultat = " + e.eval(variables));
                Sexpr latest = new Variable("ans");
                Sexpr ans = new Assignment(e, latest);
                ans.eval(variables);
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
    }
}
