import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	
	
	@Test
	void givenConstructor() {
		Date d = new Date("03/03/2010");
		assertEquals(d.date,"03/03/2010");
	}//end of given Constructor
	
	//test if it works with empty constructor 
	@Test
	void emptyConstructor() {
		Date d = new Date("");
		assertEquals(d.date,"");
	}
	
	//test the output of toString method 
	@Test
	void testToString() {
		Date d = new Date("03/03/2010");
		assertEquals(d.date,d.toString());
	}
	
	//if both objects are the same output true
	@Test
	void test_if_equal_works_same_args() {
		Date d = new Date("03/03/2222");
		Date c = new Date("03/03/2222");
		assertTrue(d.equals(c));
	}
	
	//if both objects aren't the same output false
	@Test
	void test_if_equal_works_not_same_args() {
		Date d = new Date("03/03/2222");
		Date c = new Date("03/03/2202");
		assertFalse(d.equals(c));
	}
	
	
	
	
	
	
	





}//end of DateTest
