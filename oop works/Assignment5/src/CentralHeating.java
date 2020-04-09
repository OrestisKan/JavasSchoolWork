
public class CentralHeating implements HeatingSystem {

	@Override
	/**
	 * This method when is called gets the number of rooms 
	 * of the house as input 
	 * and thn outputs the efficiency of the house 
	 * related the number of rooms
	 */
	public char getEnergyEfficiency(int rooms) {
		char result=' ';
		switch (rooms){
			case 1: case 2: {result = 'A';}
								break;
			case 3: case 4: {result = 'B';}
								break;
			case 5: case 6: {result = 'C';}
								break;
			case 7: case 8: {result = 'D';}
								break;
			default  :      {result = 'E';}
								break;
			
		}//end of switch
		
		return result;
	}//end of get Energy Efficiency
	
}//end of Central heating
