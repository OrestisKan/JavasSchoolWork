import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



public class Assignment1_3Test {

    @Test
    public void runTestOnlyAndy() {
        char output = Assignment1_3.run("Andy");
        assertEquals('V', output);
    }

    @Test
    public void runTestNoAndy() {
        char output = Assignment1_3.run("This does not contain the word An-dy");
        assertEquals('X', output);
    }

    @Test
    public void runTestNoText() {
        char output = Assignment1_3.run("");
        assertEquals('X', output);
    }

    @Test
    public void runTestAndyAtTheEnd() {
        char output = Assignment1_3.run("This contains the word Andy");
        assertEquals('V', output);
    }

    @Test
    public void runTestAndyMiddle() {
        char output = Assignment1_3.run("This contains the word Andy in the middle of the sentence");
        assertEquals('V', output);
    }

}
