import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public abstract class House {
	Address address;
	int nRooms ;
	int salePrice;
	boolean available;
	HeatingSystem heatingsystem;
	
	abstract String getAvailabilityText();
	
	
	
	public House(Address address, int nRooms, int salePrice, boolean availability,HeatingSystem heat) {
		this.address=address;
		this.nRooms=nRooms;
		this.salePrice=salePrice;
		this.available=availability;
		this.heatingsystem = heat;
	}//end of constructor
	
	public boolean costsAtMost(int price) {
		boolean ans=false;
		if (this.salePrice <= price) {
			ans=true;
		}
		return ans;
		
	}//end of costsatmost 
	public static int readNumOfHouses(String fileName) {
		int result=0;
		try {
			FileReader file = new FileReader(fileName);
			Scanner sc =new Scanner (file);
		
		 result=sc.nextInt();
		sc.close();
			//return result;
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	
	public static House read(String fileName) {
		HeatingSystem heat;
		House house;
			//FileReader file = new FileReader(fileName);
			Scanner sc =new Scanner (fileName);
		
		
			sc.nextInt();
			
			//for (int i = 1; i <= num ; i++ ) {
				String state = sc.next();
				
				String street=sc.next();
				int housenum = sc.nextInt(); //may need read next then paseInt
				String postcode =sc.next();
				String city =sc.next();
				
				Address address = new Address(street ,housenum ,postcode ,city);
				int rooms = sc.nextInt();
				sc.next();
				sc.next();
				int price = sc.nextInt();
				String tempHeat = sc.next();
				if(tempHeat=="boiler"){
					 heat = new Boiler();
				}else {
					 heat = new CentralHeating();
				}
				switch (state) {
					case "FOR SALE:" :	 {house = new OwnerOccupiedHouse(address,rooms,price,true, heat);}
												break;
					case "SOLD:" : {house = new OwnerOccupiedHouse(address,rooms,price,false,heat); }
												break;
					case "FOR RENT:" : {house = new RentalHouse(address , rooms , price ,true,heat);}
												break;
					case "RENTED:" : {house = new RentalHouse(address , rooms , price ,false,heat);}
												break;
					default: {house = new OwnerOccupiedHouse(address,rooms,price,false,heat);}
								
		}//end of switch 
			sc.close();
			return house;
		
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

