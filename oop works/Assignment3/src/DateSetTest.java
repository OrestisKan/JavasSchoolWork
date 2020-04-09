import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateSetTest {
	//testing for add method 
	@Test
	void check_add() {
		DateSet d = new DateSet();
		Date de =new Date("03/03/2010");
		d.add(de);
		assertTrue(d.contains(de));
		
	}//end of check_add
	
	//testing for contains method when the DateSet actually contains the Date so output will be true 
	@Test
	void contains_equals_true() {
		DateSet d = new DateSet();
		Date de =new Date("03/03/2010");
		d.add(de);
		assertTrue(d.contains(de));
	}//end of contains equals true method 

	//testing for contains method when the DateSet doesn't contains the Date so output will be false  
	@Test
	void does_not_contain_equals_false() {
		DateSet d = new DateSet();
		Date de =new Date("03/03/2011");
		Date dr =new Date("03/03/2012");
		Date dt =new Date("03/03/2013");
		Date dy =new Date("03/03/2014");
		Date du =new Date("03/03/2015");
		Date di =new Date("03/03/2016");
		d.add(de);
		d.add(dr);
		d.add(dt);
		d.add(dy);
		d.add(du);
		assertFalse(d.contains(di));
		

	}//end of does not contain hence equals false 
	
	//checking the intersection method 
	@Test
	void intersection_works_there_is_1_intersection(){
		DateSet d = new DateSet();
		DateSet other = new DateSet();
		Date de =new Date("03/03/2011");
		d.add(de);
		other.add(de);
		DateSet result=(d.intersection(other));
		
		assertEquals(result.toString(),"[03/03/2011]");
		
	}//end of intersection workks there is 1 intersection 
	@Test
	void intersection_works_there_is_2_intersection(){
		DateSet d = new DateSet();
		DateSet other = new DateSet();
		Date de =new Date("03/03/2011");
		Date dr =new Date("03/03/2012");
		d.add(de);
		other.add(de);
		d.add(dr);
		other.add(dr);
		DateSet result=(d.intersection(other));
		
		assertTrue(result.contains(de));
		assertTrue(result.contains(dr));
		
	}//end of intersection works when there is 2 intersections 
	@Test
	void intersection_works_there_is_no_intersection(){
		DateSet d = new DateSet();
		DateSet other = new DateSet();
		Date de =new Date("03/03/2011");
		Date dr =new Date("03/03/2012");
		other.add(de);
		d.add(dr);
		DateSet result=(d.intersection(other));
		assertFalse(result.contains(de));
		assertFalse(result.contains(dr));
		
	}//end of intersection works when there is no intersection

	//checking if equals works with empty lists
	@Test
	
	void check_if_equals_works_when_both_are_equal() {
		DateSet d = new DateSet();
		DateSet other = new DateSet();
		assertTrue(d.equals(other));

	
	}// should output true

	//checking if equals works with 1 (the same) element in each list
		@Test
		
		void check_if_equals_works_when_both_are_equal_with_1_element() {
			DateSet d = new DateSet();
			DateSet other = new DateSet();
			Date de =new Date("03/03/2012");
			other.add(de);
			d.add(de);
			assertTrue(d.equals(other));
			
		}//should output true
		
	//checking if equals works with 1 (the same) element in each list
		@Test
		
		void check_if_equals_works_when_both_are_equal_with_2_element() {
			DateSet d = new DateSet();
			DateSet other = new DateSet();
			Date de =new Date("03/03/2012");
			Date dr =new Date("03/03/2011");
			other.add(de);
			d.add(de);
			other.add(dr);
			d.add(dr);
			assertTrue(d.equals(other));
			
		}//should output true	
	
	//checking if equals works whe they  dont have the same elements
		@Test
	void check_if_equals_work_when_the_elements_in_the_list_arent_the_same() {
			DateSet d = new DateSet();
			DateSet other = new DateSet();
			Date de =new Date("03/03/2011");
			Date dr =new Date("03/03/2012");
			Date dt =new Date("03/03/2013");
			Date dy =new Date("03/03/2014");
			Date du =new Date("03/03/2015");
			Date di =new Date("03/03/2016");
			Date dp =new Date("03/03/2017");
			d.add(de);
			d.add(dr);
			d.add(dt);
			d.add(dy);
			d.add(du);
			d.add(di);
			d.add(dp);
			other.add(de);
			other.add(dr);
			other.add(dt);
			other.add(dy);
			other.add(du);
			other.add(di);
			assertFalse(d.equals(other));
		
		
		}//end of equls with no same elements
		
		
		
		
		


}//end of DateSetTest
