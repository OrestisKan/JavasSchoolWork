import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment1_4Test {

    @Test
    public void runTestThirdIsLargest() {
        int output = Assignment1_4.run(1, 2, 4);

        assertEquals("The third number is the largest, so the method should return 3", 3, output);
    }

    @Test
    public void runTestThirdIsLargest2() {
        int output = Assignment1_4.run(-50, 2, 3);

        assertEquals("The third number is the largest, so the method should return 3", 3, output);
    }

    @Test
    public void runTestSecondIsLargest() {
        int output = Assignment1_4.run(-50, -1, -20);

        assertEquals("The second number is the largest, so the method should return 2", 2, output);
    }

    @Test
    public void runTestFirstIsLargest() {
        int output = Assignment1_4.run(Integer.MAX_VALUE, 500, 3);

        assertEquals("The first number is the largest, so the method should return 1",1, output);
    }

    @Test
    public void runTestFirstAndSecondAreEqual() {
        int output = Assignment1_4.run(0, 0, 3);

        assertEquals("The first number and second number are equal, so the method should return -1", -1, output);
    }

    @Test
    public void runTestSecondAndThirdAreEqual() {
        int output = Assignment1_4.run(5, 0, 5);

        assertEquals("The first number and third number are equal, so the method should return -1", -1, output);
    }

    @Test
    public void runTestFirstAndThirdAreEqual() {
        int output = Assignment1_4.run(3, 0, 0);

        assertEquals("The second number and third number are equal, so the method should return -1", -1, output);
    }
}