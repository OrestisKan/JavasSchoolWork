import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment1_5Test {

    @Test
    public void getStarsTest1() throws Exception {
        String expected = "*\n";
        assertEquals(expected, Assignment1_5.run(1));
    }

    @Test
    public void getStarsTest2() throws Exception {
        String expected =
                "**\n" +
                "**\n";
        assertEquals(expected, Assignment1_5.run(2));
    }

    @Test
    public void getStarsTest3() throws Exception {
        String expected =
                "***\n" +
                "***\n" +
                "***\n";
        assertEquals(expected, Assignment1_5.run(3));
    }



}