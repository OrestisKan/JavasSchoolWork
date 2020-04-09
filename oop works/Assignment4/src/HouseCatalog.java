import java.io.IOException;
import java.util.*;
import java.io.*;
public class HouseCatalog {
	Set<House> houses;
	
	public HouseCatalog() {
		houses= new HashSet<House>();
	}//end of constructor
	
	public void addHouse(House house) {
		houses.add(house);
	
	}//end of addHouse 

	
	public List<House> housesCostAtMost(int price){
		List<House> ans= new ArrayList<House>();
		for(House house : houses) {
			if(house.getSalePrice() <= price) {
				ans.add(house);
			}
		}
		return ans;
		
	}//end of housesCostAtMost
	
	public static HouseCatalog read(String fileName) {
		HouseCatalog ans = new HouseCatalog();
		try {
			FileReader file = new FileReader(fileName);
			Scanner sc =new Scanner (file); 
			
			
			int NumOfHouses = sc.nextInt();
			if (NumOfHouses >0) {
				for(int i=1; i <= NumOfHouses;i++ ) {
					House h1 =  House.read(sc) ;
					ans.addHouse(h1);
					
				}//end of for
		
				
			}//end of if 
		
			sc.close();
			
		}//end of try
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return ans;
	}//end of read

	public String toString() {
		String result="";
		for (House house:houses) {
			result = house.toString()+ "\n";
			}
		
		return result;
		
	
	}//end of toString
	
	
}//end of HouseCatalog

