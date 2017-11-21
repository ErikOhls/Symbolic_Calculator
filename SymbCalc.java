package symbolic;
import java.util.HashMap;
import java.util.Map;

public class SymbCalc {

    public static void main() {

        // Parser tolkar input och gör en Symbolic expression(Sexpr)
        // som klassen Sexpr sedan evaluerar
        Parser p = new Parser();
        
        // variables ska innehålla *alla* expressions? Eller bara själva variablerna?
        Map<String,Sexpr> variables = new HashMap<String,Sexpr>();

        while (true)
            try {
                /*
                System.out.print("? ");
                Sexpr e = p.statement();
                System.out.println("Inläst uttryck: " + e);  // För kontroll
                System.out.println(e.eval(variables));
                */
            } catch (Exception e) {
            }
    }
}
