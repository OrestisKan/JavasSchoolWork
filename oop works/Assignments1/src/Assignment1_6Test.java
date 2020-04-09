import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment1_6Test {
    @Test
    public void runTest1() throws Exception {
        String expected = "*\n";
        assertEquals(expected, Assignment1_6.run(1));
    }

    @Test
    public void runTest2() throws Exception {
        String expected =
                "*\n" +
                "**\n";
        assertEquals(expected, Assignment1_6.run(2));
    }

    @Test
    public void runTest6() throws Exception {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n";
        assertEquals(expected, Assignment1_6.run(6));
    }

}