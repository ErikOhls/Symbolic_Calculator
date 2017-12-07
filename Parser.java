import java.io.StreamTokenizer;
import java.io.IOException;

public class Parser {

    StreamTokenizer stream;

    public Parser(){
        stream = new StreamTokenizer(System.in);
        stream.ordinaryChar('-');
        stream.ordinaryChar('/');
        stream.ordinaryChar('+');
        stream.eolIsSignificant(true);
    }

    public Sexpr statement() throws IOException{
        Sexpr statement = expression();
        return statement;
    }

    public Sexpr expression() throws IOException{
        Sexpr argLeft = number();
        stream.nextToken();

        if(stream.ttype == '+'){
            stream.nextToken();
            Sexpr expression = new Addition(argLeft, statement());
            return expression;
        }

        if(stream.ttype == '-'){
            stream.nextToken();
            Sexpr expression = new Subtraction(argLeft, statement());
            return expression;
        }

        return argLeft;
    }

    public Sexpr number() throws IOException{
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
