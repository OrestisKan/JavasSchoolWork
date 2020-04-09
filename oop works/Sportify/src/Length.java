
public class Length {
	String minutes;
	String seconds;
	
	public Length(String mins , String secs) {
		this.minutes=mins;
		this.seconds=secs;
	
	}//end of constructor
	
	public Length getTime () {
		Length time = new Length(this.minutes , this.seconds) ;
		
		return time ;
	}//end of getTime 

	public String toString() {
		String result;
		
		result = minutes+":"+seconds;
		return result;
	}

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getSeconds() {
		return seconds;
	}

	public void setSeconds(String seconds) {
		this.seconds = seconds;
	}


}//end of Length
