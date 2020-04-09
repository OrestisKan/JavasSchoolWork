import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {
	
	
	/* by doing this test we are testing both the house constructor and the toString method */
	@Test
	void test_constructor() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		House h = new House(a , 5 , 10);
		assertEquals(h.toString(),"Korveeestraat 299 2628DM Delft 5 10");
		
	}//end of test the constructor
	
	
	//with this 3 methods we check every possible combination of budgets lower equal or higher
	
	@Test
	void lower_budget() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		House h = new House(a , 5 , 1000);
		
		assertFalse(h.costsAtMost(500));	
	}//end of lower budget
	
	@Test
	void equal_budget() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		House h = new House(a , 5 , 1000);
		
		assertTrue(h.costsAtMost(1000));	
	}//end of equal budget
	
	@Test
	void higher_budget() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		House h = new House(a , 5 , 1000);
		
		assertTrue(h.costsAtMost(10000));	
	}//end of higher budget
	
	
	//here we will do 2 checks about the equal method
	@Test
	void equal_objects_different_addresses() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		Address b = new Address("Korveeestraat",298,"2628DN","Delft");
		House h1 = new House(a , 5 , 1000);
		House h2 = new House(b , 5 , 1000);
		assertFalse(h1.equals(h2));
		
		
	}//equal_objects_different_addresses
		@Test
	void equal_objects_same_addresses() {
		Address a = new Address("Korveeestraat",299,"2628DM","Delft");
		Address b = new Address("Korveeestraat",299,"2628DM","Delft");
		House h1 = new House(a , 5 , 1000);
		House h2 = new House(b , 5 , 1000);
		assertTrue(h1.equals(h2));
		
		
	}//equal_objects_same_addresses
	
	
	//if anythings wrong test 
	//test the read method 
	
	
	
	
	
	
	
	
	
	
}//end of HouseTest class
