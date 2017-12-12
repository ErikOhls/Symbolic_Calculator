import java.io.StreamTokenizer;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class Parser {

    StreamTokenizer stream;

    public Parser(){
        stream = new StreamTokenizer(System.in);
        stream.ordinaryChar('-');
        stream.ordinaryChar('/');
        stream.ordinaryChar('+');
        stream.ordinaryChar('*');
        stream.eolIsSignificant(true);
    }

    public Parser(String string){
        ByteArrayInputStream input = new ByteArrayInputStream(string.getBytes());
        System.setIn(input);
        stream = new StreamTokenizer(System.in);
        stream.ordinaryChar('-');
        stream.ordinaryChar('/');
        stream.ordinaryChar('+');
        stream.ordinaryChar('*');
        stream.eolIsSignificant(true);
    }

    /**
     * Parses user input and converts it to a Symbolic expression(Sexpr) which can be evaluated to a result. Also assignes variables where applicable.
     *
     * @param <no argument, delete this line>
     * @return Complete parsed Sexpr of user input or instance of quit/vars
     */
    public Sexpr statement() throws IOException{
        Sexpr statement;
        stream.nextToken();
        if(stream.ttype == stream.TT_WORD){
            if(stream.sval.equals("quit")){
                trace("returning instance of quit", 0);
                return Quit.getInstance();
            }
            if(stream.sval.equals("vars")){
                trace("returning instance of vars", 0);
                return Vars.getInstance();
            }
        }

        trace("statement not quit or vars", 0);
        stream.pushBack();
        statement = assignment();
        stream.nextToken();
        return statement;
    }

    public Sexpr assignment() throws IOException{
        trace("Assignment. Token = " + stream.sval + " or " + stream.nval, 0);
        Sexpr assignment = expression();

        while (stream.ttype == '=') {
            trace("Making new Assignment: ", 0);
            assignment = new Assignment(assignment, expression());
        }
        return assignment;
    }

    public Sexpr expression() throws IOException{
        trace("Expression. Token = " + stream.sval  + " or " + stream.nval, 1);
        Sexpr sum = term();
        stream.nextToken();

        while (stream.ttype == '+' || stream.ttype == '-'){
            trace("Making new add/sub: ", 1);
            if(stream.ttype == '+'){
                sum = new Addition(sum, term());
            }

            else{
                sum = new Subtraction(sum, term());
            }
            stream.nextToken();
        }
        stream.pushBack();
        return sum;
    }

    public Sexpr term() throws IOException{
        trace("Term. Token = " + stream.sval + " or " + stream.nval, 2);
        Sexpr prod = factor();
        stream.nextToken();

        while (stream.ttype  == '*' || stream.ttype == '/'){
            trace("Making new multi/div: ", 2);
            if(stream.ttype == '*'){
                prod = new Multiplication(prod, factor());
            }

            else{
                prod = new Division(prod, factor());
            }
            stream.nextToken();
        }
        stream.pushBack();
        return prod;
    }

    public Sexpr factor() throws IOException{
        trace("Factor. Token = " + stream.sval + " or " + stream.nval, 3);
        Sexpr result;

        stream.nextToken();

        if(stream.ttype == '-'){
            stream.nextToken();
            trace("Making new Negation: " + stream.nval, 3);
            stream.pushBack();
            return new Negation(factor());
        }

        //stream.nextToken();

        if(stream.ttype != '('){
            if(stream.ttype == stream.TT_WORD){
                trace("Making new Unary: " + stream.nval, 3);
                switch(stream.sval){
                case "sin" :
                    result = new Sin(factor());
                    break;
                case "cos" :
                    result = new Cos(factor());
                    break;
                case "exp" :
                    result = new Exp(factor());
                    break;
                case "log" :
                    result = new Log(factor());
                    break;
                case "-" :
                    result = new Negation(factor());
                    break;
                default :
                    result = new Variable(stream.sval);
                }
            }

            else{
                stream.pushBack();
                result = number();
            }
        }

        else{
            result = expression();
            if(stream.nextToken() != ')'){
                throw new SyntaxErrorException("Expected ')'");
            }
        }
        return result;
    }

    public Sexpr number() throws IOException{
        trace("Number. Token = " + stream.nval, 4);
        stream.nextToken();

        if(stream.ttype == stream.TT_NUMBER){
            trace("Making new number: " + stream.nval, 4);
            return new Constant(stream.nval);
        }

        else{
            stream.nextToken();
            trace("Making new variable: " + stream.sval, 4);
            return new Variable(stream.sval);
        }
    }

    public void trace(String s, int indent){
        int on = 1;
        if(on == 1){
            for(int i = indent; i > -1; i--){
                System.err.print("-");
                if(indent-i == indent){
                    System.err.print("|");
                }
            }
            System.err.println(s);
        }
    }
}

class SyntaxErrorException extends RuntimeException{
    public SyntaxErrorException(){
        super();
    }
    public SyntaxErrorException(String msg){
        super(msg);
    }
}
