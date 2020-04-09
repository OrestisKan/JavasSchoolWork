import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	
	Person p1=new Person("John");
	Person p2=new Person("Janish");
	Date d1 = new Date("03/03/2010");
	Date d2 = new Date("03/03/2011");
	Date d3 = new Date("03/03/2012");
	
	//here we are testing if the constructor created the objects here both have only one date
	//which is the same but the names are diferent so assertFalse should output true 
	@Test
	void test_the_constructor() {
		Person p1=new Person("Jasper");
		assertTrue(p1.names.equals("Jasper"));
	}//end of test the constructor test
	
	@Test
	void testing_the_addDate_method() {
		p1.addDate(d1);
		assertEquals(p1.getDates().toString(),"[03/03/2010]");
		
	}//end of testing the addDate method method
	
	//testing the getNames method 
	@Test
	void testing_the_getNames_method() {
		assertEquals(p1.getName().toString(),"John");
		
	}//end of testing the getNames method 
	
	//therefore the next tests will be about the equals
	//method of the Person class
	
	@Test
	void when_the_2objects_arent_the_same() {
		p1.addDate(d1);
		p2.addDate(d2);
		assertFalse(p1.equals(p2));
		
	}//end of method 
	
	@Test
	void when_the_2objects_arent_the_same_not_the_same_name_but_same_date() {
		p1.addDate(d1);
		p2.addDate(d1);
		assertFalse(p1.equals(p2));
		
	}//end of method 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	

}//end of person test class
