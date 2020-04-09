import java.util.*;
import java.io.*;
public abstract  class Trains {
	String departureTime;
	String arrivalTime;
	String type ; 
	ArrayList<String> IntercityStops = new ArrayList<String>();
	ArrayList<String> AllStops = new ArrayList<String>();
	
	/**
	 * This is the trains constructor
	 */
	public Trains (String dTime , String aTime , ArrayList<String> Stops ,ArrayList<String> aStops ) {
		this.arrivalTime=aTime;
		this.departureTime = dTime;
		this.IntercityStops.addAll(Stops);
		this.AllStops.addAll(aStops);
		}//end of constructor 
	
	
	/**
	 * This method is going to read the file and then create an object out of it either an Intercity
	 * or a Sprinter
	 * @param sc
	 * @param fileName
	 * @return
	 */
	public Trains read ( String fileName) {
		
		try {
			
			Trains train;
			FileReader file = new FileReader(fileName);
			Scanner sc  = new Scanner(file);
			//String stationType= "";
			sc.next();
			type = sc.next();
			if (type=="INTERCITY") {
				sc.next();
				String dTime = sc.next();
				sc.next();
				String aTime=sc.next();
				while (sc.next() != "END") {
					type = sc.next();	
					if (type=="IC-STATION") {
						IntercityStops.add(sc.next());
					}//end of if
				}//end of while
				train = new Intercity(dTime , aTime ,IntercityStops , AllStops );
				return train;
			}else if (type=="SPRINTER") {
				sc.next();
				String dTime = sc.next();
				sc.next();
				String aTime=sc.next();
				while (sc.next() != "END") {
					    sc.next();	
						AllStops.add(sc.next());
				}//end of while
			
				train = new Sprinter(dTime , aTime ,IntercityStops , AllStops );
				return train;
			}//end of if else 
			
			
			sc.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}//end of try catch 
		return null;
		
	}//end of read 


	public String getDepartureTime() {
		return departureTime;
	}


	public String getArrivalTime() {
		return arrivalTime;
	}


	public String getType() {
		return type;
	}


	public ArrayList<String> getIntercityStops() {
		return IntercityStops;
	}


	public ArrayList<String> getAllStops() {
		return AllStops;
	}


	public int numOfTrains(String fileName) {
		int result=0;
		
		try {
			FileReader file = new FileReader(fileName);
			Scanner sc  = new Scanner(file);
			while(sc.hasNext()) {
				
				if(sc.next()=="END") {
					result++;
				}
			}//end of while
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}//end of numOfTrains


	@Override
	public boolean equals(Object arg0) {
		boolean ans = false;
		if (arg0 instanceof Trains) {
			ans=true;
		}
		return ans;
	}


}//end of class
