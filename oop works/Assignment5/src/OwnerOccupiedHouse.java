
public class OwnerOccupiedHouse extends House {
  
	
	public OwnerOccupiedHouse(Address address, int nRooms, int salePrice,boolean available,HeatingSystem heat) {
		super(address, nRooms, salePrice, available,heat);
			
	}//end of constructor
	

	/**
	 * return the state of the property
	 */
	@Override
	String getAvailabilityText() {
		String result="";
		if (this.available = true) {
			result = "FOR SALE";
		}else {
			result="SOLD";
		}
		return result;
	}//end of get availabilityText method 

	
	

}//end of OwnerOccupiedHouse class
