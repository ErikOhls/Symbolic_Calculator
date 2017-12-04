import java.io.StreamTokenizer;
import java.io.IOException;

public class Parser {

    StreamTokenizer stream;

    public Parser(){
        stream = new StreamTokenizer(System.in);
        stream.ordinaryChar('-');
        stream.ordinaryChar('/');
        stream.eolIsSignificant(true);
    }

    public Sexpr statement() throws IOException{
        double sum;
        stream.nextToken();
        sum = stream.nval;

        Sexpr result = new Constant(sum);

        return result;
    }
}
