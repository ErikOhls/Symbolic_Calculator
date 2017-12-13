import org.junit.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import java.io.IOException;
import java.util.*;

public class Tests{
    HashMap<String, Sexpr> variables;

    @Test
    public void testConstant(){
        //er = ExpectedResult;
        String er = "1.0";
        Parser p = new Parser("1");
        try{
            Sexpr e = p.statement();
            assertTrue(e.toString().equals(er));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testAddition(){
        String er = "1.0+1.0";
        Parser p = new Parser("1+1");
        try{
            Sexpr e = p.statement();
            assertTrue(e.toString().equals(er));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testSubtraction(){
        String er = "1.0-1.0";
        Parser p = new Parser("1-1");
        try{
            Sexpr e = p.statement();
            assertTrue(e.toString().equals(er));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testMultiplication(){
        String er = "1.0*1.0";
        Parser p = new Parser("1*1");
        try{
            Sexpr e = p.statement();
            assertTrue(e.toString().equals(er));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testDivision(){
        String er = "1.0/1.0";
        Parser p = new Parser("1/1");
        try{
            Sexpr e = p.statement();
            assertTrue(e.toString().equals(er));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testUnarySin(){
        String er = "Sin(1.0)";
        Parser p = new Parser("sin(1)");
        try{
            Sexpr e = p.statement();
            assertTrue(e.toString().equals(er));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testVarAssign(){
        String er = "1.0=x";
        Parser p = new Parser("1=x");
        try{
            Sexpr e = p.statement();
            assertTrue(e.toString().equals(er));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalConstant(){
        Double er = 1.0;
        Parser p = new Parser("1");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalAddition(){
        Double er = 2.0;
        Parser p = new Parser("1+1");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalSubtraction(){
        Double er = 0.0;
        Parser p = new Parser("1-1");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalMultiplication(){
        Double er = 2.0;
        Parser p = new Parser("1*2");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalDivision(){
        Double er = 0.5;
        Parser p = new Parser("1/2");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalUnarySin(){
        Double er = 0.8414709848078965;
        Parser p = new Parser("sin(1)");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalPriority(){
        Double er = 10.0;
        Parser p = new Parser("(1+1)*5");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEvalCombination(){
        Double er = 4.243197504692072;
        Parser p = new Parser("1+1*sin(4*(2+2)/4)+4");
        try{
            Sexpr e = p.statement();
            assertEquals(e.eval(variables).getValue(), er);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
