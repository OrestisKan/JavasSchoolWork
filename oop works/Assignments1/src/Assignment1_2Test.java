import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment1_2Test {

    private final double delta = 1E-6;

    @Test
    public void runTest() {
        double output = Assignment1_2.run(10.0);

        assertEquals(50, output, delta);
    }

    @Test
    public void runTestLargerNumber() {
        double output = Assignment1_2.run(5505);

        assertEquals(9941, output, delta);
    }

    @Test
    public void runTestWithZero() {
        double output = Assignment1_2.run(0.0);

        assertEquals(32, output, delta);
    }

    @Test
    public void runTestWithNegativeNumber() {
        double output = Assignment1_2.run(-42.0);

        assertEquals(-43.6, output, delta);
    }


}