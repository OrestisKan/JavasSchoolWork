import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import  java.util.Scanner;
import java.io.*;

import java.nio.charset.StandardCharsets;
class AddressTest {

	@Test
	void test_the_constructor() {
	 Address a = new Address("Korveeestraat",299,"2628DM","Delft");
	 assertEquals(a.toString(),"Korveeestraat 299 2628DM Delft");
	}//end of test the contrusctor
	
	/* Hence after this test we tested 2 things
	  1) Address constructor
	  2) toString overwriten method  */
	
	
	//in this test we will check if it works when the objects arent equal
	@Test
	void test_equals_with_no_equal_objects() {
		 Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		 int num=-5;
		 assertFalse(a.equals(num));
	}
	
	//in this Test we will check same objects different arguments passed
	@Test
	void test_equals_same_objects_dif_args() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		Address b = new Address("Korveeestraat",2345,"2458DN","Delft");
		assertFalse(a.equals(b));
	
	}
	
	//in this Test we will check 2 same objects with same args 
	@Test
	void test_equals_same_objects_same_args() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		Address b = new Address("Korveeestraat",299,"2628DM","Delft");
		assertTrue(a.equals(b));
	}
	
	//in this Test we will test the read Method 
	
	@Test
	void test_the_read_method() {
		String testString=" street 45 2628DM delft";
		InputStream teststream= new ByteArrayInputStream(testString.getBytes(StandardCharsets.UTF_8));
		Scanner testScanner= new Scanner(teststream);
		
		assertEquals(Address.read(testScanner).toString(),"street 45 2628DM delft");
		
	}
	
	
	
	
}//end of AddressTest class
