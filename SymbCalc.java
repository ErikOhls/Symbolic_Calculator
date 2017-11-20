public class SymbCalc {

    public static void main() {

        Parser p = new Parser();
        Map<String,Sexpr> variables = new HashMap<String,Sexpr>();

        while (true)
            try {
                System.out.print("? ");
                Sexpr e = p.statement();
                System.out.println("Inläst uttryck: " + e)  // För kontroll
                    System.out.println(e.eval(variables));
            }/* catch (...) {
                ...
                } */
    }
}
