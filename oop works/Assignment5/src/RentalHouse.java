
public class RentalHouse extends House {
	
	
	
	
	public RentalHouse(Address address, int nRooms, int salePrice,boolean available,HeatingSystem heat) {
		super(address, nRooms, salePrice,available,heat);
		
	}//end of constructor

	/**
	 * return the state of the property
	 */
	String getAvailabilityText() {
		String result="";
		
		if (this.available = true) {
			result = "FOR RENT";
		}else {
			result="RENTED";
		}
		
		return result;
	}//end of get Availability Text

}//end of RentalHouse class
