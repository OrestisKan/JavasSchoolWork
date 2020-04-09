import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment1_1Test {

    @Test
    public void runTestNumberPlusOne() {
        //We declare a variable to use as input
        int input = 10;

        //Execute the run method from Assignment 1.1
        int output = Assignment1_1.run(input);

        //Check if the returned value is 1 higher than the input we provided
        assertEquals(11, output);
    }

    @Test
    public void runTestForthyOnePlusOne() {
        //We declare a variable to use as input
        int input = 41;

        //Execute the run method from Assignment 1.1
        int output = Assignment1_1.run(input);

        //Check if the returned value is 1 higher than the input we provided
        assertEquals(42, output);
    }

    @Test
    public void runTestLargeNumberPlusOne() {
        //We declare a variable to use as input
        int input = 2147483647;

        //Execute the run method from Assignment 1.1
        int output = Assignment1_1.run(input);

        //Check if the returned value is the output we are expecting
        int expectedoutput = -2147483648;
        assertEquals(expectedoutput, output);
    }

}