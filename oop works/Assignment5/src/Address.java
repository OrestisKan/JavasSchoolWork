import java.util.Scanner;
public class Address {
	String street;
	int number;
	String zipCode;
	String city;
	
	public Address(String street, int number, String zipCode, String city) {
		this.street=street;
		this.number=number;
		this.zipCode=zipCode;
		this.city=city;
	}//end of constructor

	public static Address read(Scanner sc) {
		if (sc.hasNextLine()) {
			String a=sc.next();
			int n = sc.nextInt(); //may need read next then paseInt
			String b =sc.next();
			String c =sc.next();
			
		Address address = new Address(a ,n ,b ,c);
		
		return address;
		}else {
			throw new IllegalArgumentException();
		}
	}//end of read method
	
	public String toString() {
		String result="";
		String a = street;
		String b = Integer.toString(number);
		String c = zipCode;
		String d = city;
		result = a + " "+ b+" "+ c + " "+d;
		
		return result;
	}//end of to String()
	
	public boolean equals(Object other) {
		boolean ans=false;
		if (other instanceof Address) {
			Address that = (Address) other;
			if((this.zipCode == that.zipCode)&&(this.number==that.number)) {
				ans=true;
			}
		}
		return ans;
		
		
	}//end of equals method 
	
	
	



}//end of Address class
