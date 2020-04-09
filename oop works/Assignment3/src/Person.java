
public class Person {
	//declaring variables 
	String names;
	DateSet dates;
	
	public Person(String name) {
		this.names=name;
		this.dates=new DateSet();
		
	
	}//end of name constractor
	
	
	
	public DateSet getDates() {
		return dates;
	}

	public String getName() {
		return names;
	}

	public void addDate(Date date) {
		if((date.date.toString()=="")||(date.date.toString()!="")) {
			dates.add(date);
		}else {
			throw new IllegalArgumentException();
		}//end of if else 
	}//end of addDate method
	
	public boolean equals(Object other) {
		boolean ans=false;
		if (other instanceof Person) {
			if(this.getDates().equals(((Person) other).getDates())) {
				if (this.names==other.getClass().getName()) {
					ans=true;	
				}
				
			}//end of inner if 
		}//end of if 
		
		
		return ans;
		
	}//end of equals method 
	
	public String toString() {
		return this.toString();
	}
	
	
	
}//end of person class
