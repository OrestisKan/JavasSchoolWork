import java.util.*;
public class House {
	Address address;
	int nRooms ;
	int salePrice;
	
	public House(Address address, int nRooms, int salePrice) {
		this.address=address;
		this.nRooms=nRooms;
		this.salePrice=salePrice;
	}//end of constructor
	
	public boolean costsAtMost(int price) {
		boolean ans=false;
		if (this.salePrice <= price) {
			ans=true;
		}
		
		return ans;
		
	}//end of costsatmost 
	
	
	
	public static House read(Scanner sc) {
		if (sc.hasNextLine()) {
			String a=sc.next();
			int n = sc.nextInt(); //may need read next then paseInt
			String b =sc.next();
			String c =sc.next();
			
		Address address = new Address(a ,n ,b ,c);
			int r = sc.nextInt();
			int p = sc.nextInt();
			
			House house = new House(address,r,p);
			return house;
		}else {
			throw new IllegalArgumentException();
		}
		
	}//end of read method 
	
	public String toString() {
		String result="";
		String a = address.street;
		String b = Integer.toString(address.number);
		String c = address.zipCode;
		String d = address.city;
		int e = nRooms;
		int f = salePrice;
		
		result= a + " "+ b+" "+ c + " "+d+" " + e + " "+ f;
		return result;
		
	}//end of toString
	
	public boolean equals(Object other) {
		boolean ans=false;
		if (other instanceof House) {
			House that = (House) other;
			if((this.address.zipCode == that.address.zipCode)&&(this.address.number==that.address.number)) {
				ans=true;
			}
		}
		
		return ans;
	}//end of equals method 

	public Address getAddress() {
		return address;
	}

	public int getnRooms() {
		return nRooms;
	}

	public int getSalePrice() {
		return salePrice;
	}
	
	
	
	
}//end of house class
