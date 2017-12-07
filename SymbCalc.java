import java.util.HashMap;
import java.util.Map;

public class SymbCalc {

    public static void main(String[] args) {

        // Parser tolkar input och gör en Symbolic expression(Sexpr)
        // som klassen Sexpr sedan evaluerar
        Parser p = new Parser();

        HashMap<String,Sexpr> variables = new HashMap<String,Sexpr>();

        while (true)
            try {
                System.out.print("? ");
                Sexpr e = p.statement();
                System.out.println("test");
                System.out.println("Inläst uttryck: " + e);  // För kontroll
                System.out.println(e.eval(variables));
            } catch (Exception e) {
            }
    }
}
