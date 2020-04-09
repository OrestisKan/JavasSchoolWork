
public class Date {
	String date;
	
	public Date(String date) {
		this.date=date;
	}//end of date constructor

	public String toString() {
		return date.toString();
	}//end of toString method
	
	public boolean equals(Object other) {
		boolean ans=false;
		if (other instanceof Date ) {
			Date that=(Date)other;
			if(this.date.equals(that.date)) {
				ans=true;
			}//end of inner loop
		}//end of if
		
		return ans;
		
	}//end of equals method 
	
	
	
}//end of Date class
