
public class Boiler implements HeatingSystem {

	@Override
	/**
	 * This method when is called gets the number of rooms 
	 * of the house as input 
	 * and then outputs the efficiency of the house 
	 * related the number of rooms
	 */
	public char getEnergyEfficiency(int rooms) {
		char result=' ';
		switch (rooms){
			case 1:  {result = 'A';}
								break;
			case 2:  {result = 'B';}
								break;
			case 3:  {result = 'C';}
								break;
			case 4:  {result = 'D';}
								break;
			default: {result = 'E';}
								break;
			
		}//end of switch
		
		return result;
	}//end of get Energy Efficiency
	}


