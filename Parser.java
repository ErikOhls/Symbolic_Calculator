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
        Sexpr expression = number();

        stream.nextToken();
        System.out.println("token going into +/- = " + stream.ttype);
        while (stream.ttype == '+' || stream.ttype == '-'){
            if(stream.ttype == '+'){
                //stream.nextToken();
                System.out.println("token being assigned to argRight = " + stream.nval);
                Sexpr argRight = number();
                new Addition(expression, argRight);
            }else{
                stream.nextToken();
                Sexpr argRight = number();
                new Subtraction(expression, argRight);
            }
        }

        stream.pushBack();
        return expression;
    }

    public Sexpr number() throws IOException{


        if(stream.ttype != stream.TT_NUMBER){

            throw new SyntaxErrorException("Expected number");
        }

        System.out.println("new constant = " + stream.nval);
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
