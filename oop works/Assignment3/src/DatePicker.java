import java.util.*;
public class DatePicker {
//initializing the fields 
	List <Person> persons;

	public DatePicker() {
		this.persons=new ArrayList<Person>();
	}//end of DatePicker constructor
	
	public void addPerson(Person person) {
		if(persons.contains(person)==false) {
			persons.add(person);
		}else {
			throw new IllegalArgumentException();
		}
		
	}//end of addPerson method
	
	public DateSet commonDates() {
		DateSet ans=new DateSet();
		int j=0;
		if (persons.size()>=2) {
			for (int i=0;i<= persons.size();i++) {
				ans.dates.set(j, persons.get(i).dates.dates.get(i));
				j++;
			}//end of for loop
			return ans;
	
		}else {
			throw new IllegalArgumentException();
		}//end of if-else
	}//end of commonDates method

	public String toString() {
		String ans="";
		for (int i=0; i<= persons.size();i++) {
			ans=persons.get(i).toString() + " ";	
		}//end of for method 
		
		
		return ans;
	}//end of toString method 



}//end of DatePicker class
