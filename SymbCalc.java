import java.util.HashMap;
import java.util.Map;

import symbolic.*;

public class SymbCalc {

    public static void main(String[] args) {

        // Parser tolkar input och gör en Symbolic expression(Sexpr)
        // som klassen Sexpr sedan evaluerar
        Parser p = new Parser();

        Map<String,symbolic.Sexpr> variables = new HashMap<String,symbolic.Sexpr>();

        while (true)
            try {
                System.out.print("? ");
                symbolic.Sexpr e = p.statement();
                System.out.println("Inläst uttryck: " + e);  // För kontroll
                System.out.println(e.eval(variables));
            } catch (Exception e) {
            }
    }
}
