import java.io.StreamTokenizer;
import java.io.IOException;

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

    public Sexpr statement() throws IOException{
        Sexpr statement;
        stream.nextToken();
        if(stream.ttype == stream.TT_WORD){
            if(stream.sval.equals("quit")){
                return Quit.getInstance();
            }
            if(stream.sval.equals("vars")){
                throw new SyntaxErrorException("vars is not yet implemented!");
            }
        }

        stream.pushBack();
        statement = assignment();
        return statement;
    }

    public Sexpr assignment() throws IOException{
        Sexpr assignment = expression();
        while (stream.ttype == '=') {
            assignment = new Assignment(assignment, expression());
        }
        return assignment;
    }

    public Sexpr expression() throws IOException{
        Sexpr sum = term();
        stream.nextToken();

        while (stream.ttype == '+' || stream.ttype == '-'){
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
        Sexpr prod = factor();
        stream.nextToken();
        while (stream.ttype  == '*' || stream.ttype == '/'){
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
        Sexpr result;
        stream.nextToken();
        if(stream.ttype != '('){
            if(stream.ttype == stream.TT_WORD){
                System.out.println("Unary type = " + stream.sval);
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
                    throw new SyntaxErrorException("Expected unary statement");
                }
            }

            else{
                stream.pushBack();
                result = number();
            }
        }
        /*
        public Sexpr unaryVar() throws IOException{
            
        }
        */
        else{
            result = expression();
            if(stream.nextToken() != ')'){
                throw new SyntaxErrorException("Expected ')'");
            }
        }
        return result;
    }

    public Sexpr number() throws IOException{
        stream.nextToken();
        return new Constant(stream.nval);
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
