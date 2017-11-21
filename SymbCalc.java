public class SymbCalc {

    public static void main() {

        // Hur funkar Parser?
        // Skriv den själv!
        Parser p = new Parser();

        // Hur funkar HashMap?
        // En lista med alla variabler
        // <variable name, value>
        Map<String,Sexpr> variables = new HashMap<String,Sexpr>();

        while (true)
            try {
                System.out.print("? ");
                Sexpr e = p.statement();
                System.out.println("Inläst uttryck: " + e);  // För kontroll
                System.out.println(e.eval(variables));
                // Måste ha en catch?
            } catch (Exception e) {
            }
    }
}
