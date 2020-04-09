import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DatePickerTest {

	@Test
	void test_the_Constructor() {
	 
		DatePicker dp =new DatePicker();
		Person p1=new Person("Jasper");
		dp.addPerson(p1);
		
		assertEquals(dp.persons.get(0).names,p1.names);
	}//end of test the constructor
	
	@Test
	/*since if it contains was tested in test the constructor method
	  which used the addPerson method to add a person */ 
	void test_the_add_method_if_it_doesnt_contain() {
		DatePicker dp =new DatePicker();
		Person p1=new Person("Jasper");
		dp.addPerson(p1);
		Person p2=new Person("Jasper");
		
		assertFalse(dp.persons.contains(p2));
		
	}//end of test the add method using contains
//	@Test
//	void test_common_dates() {
//		DatePicker dp =new DatePicker();
//		Person p1=new Person("Jasper");
//		Person p2=new Person("Jasper");
//		Date de =new Date("03/03/2010");
//		p2.dates.add(de);
//		p1.dates.add(de);
//		dp.addPerson(p1);
//		dp.addPerson(p2);
//		DateSet ds = new DateSet();
//		ds.add(de);
//		
//		assertEquals(dp.commonDates().dates,ds.dates);
//		
//	}//end of test_common_dates
//	
	
	

	
	
	
	
	
	
	
	
	

}//end of DatePickerTest
