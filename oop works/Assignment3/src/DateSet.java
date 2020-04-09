import java.util.*;
public class DateSet {
	List<Date> dates;
	
	public DateSet() {
		this.dates=new ArrayList<Date>();
	}//end of DateSet 
	
	
	
	
	public void add(Date date) {
		if (dates.contains(date)==false) {
			
			dates.add(date);
		}else{
			throw new IllegalArgumentException();
		}//end of if else 
		
	}//end of add method 
	
	public boolean contains(Date date) {
		if (dates.contains(date)) {
			return true;
		}else {
			return false;
		}
			
	}//end of contains method 
	
	
	public DateSet intersection(DateSet other) {
		
		DateSet newdates =new DateSet();
		int max;
		if (this.dates.size()>=other.dates.size()) {
			max=this.dates.size();
			for (int i=0;i<max;i++) {
				if (other.dates.contains(this.dates.get(i))) {
					newdates.add(this.dates.get(i));
				}//end of if 
				
			}//end of for 
		
		}else {
			max=other.dates.size();
			for (int i=0;i<max;i++) {
				if (this.dates.contains(other.dates.get(i))) {
					newdates.add(other.dates.get(i));
				}//end of if 
				
			}//end of for 
		}//end of if-else outter
		
		return newdates;
		
		
		
	}//end of intersection method 
	
	public String toString() {
		return dates.toString();
	
	}//end of to String

	public boolean equals(Object other) {
		boolean ans=false;
		int j =0;
		if (other instanceof DateSet) {
			if (((DateSet) other).dates.size()==dates.size()) {
				for (int i =0;i<dates.size();i++) {
					if (dates.get(i).equals(((DateSet) other).dates.get(i))) {
						j++;
					}
				}
			}
		}
		if (j==dates.size()) {
			ans=true;
		}
		
		return ans ;
	}




}//end of DateSet class 
