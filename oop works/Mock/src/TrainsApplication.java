import java.util.*;
import java.io.*;
public class TrainsApplication {
	/**
	 * This is the main of the program 
	 * @param args
	 */
	
	public static void main (String[] args ) {
	 System.out.println("Please enter your option:");
	 System.out.println("1 – Show all trains that are in the in-memory database on screen\r\n" + 
	 					"2 – Show all trains from station A to station B\r\n" + 
	 					"3 – Stop the program");
	 Scanner sc = new Scanner (System.in);
	 int choice = sc.nextInt();
	 
	 switch (choice) {
	 
	 case 1:  {Trains train = null;
	 				int num = train.numOfTrains("trains.txt");
	 				train.read("trains.txt");
	 			
			 		 for(int j = 1 ; j <= num;j++) {
			 			if (train.getType()== "INTERCITY") {
			 				int size = train.IntercityStops.size();
			 				System.out.println("Intercity from"+ train.getIntercityStops().get(0)+" to "+ train.getIntercityStops().get(size));
			 				System.out.println("Departure: "+ train.getDepartureTime());
			 				System.out.println("Arrival "+ train.getArrivalTime());
			 				for ( int i = 1; i <size-1;i++) {
			 					System.out.println("---"+train.getIntercityStops().get(i));
			 				}
			 				
			 			}else if (train.getType()=="SPRINTER") {
			 				int size = train.AllStops.size();
			 				System.out.println("Sprinter from"+ train.getAllStops().get(0)+" to "+ train.getAllStops().get(size));
			 				System.out.println("Departure: "+ train.getDepartureTime());
			 				System.out.println("Arrival "+ train.getArrivalTime());
			 				for ( int i = 1; i <size-1;i++) {
			 					System.out.println("---"+train.getAllStops().get(i));
			 				}
			 				
			 			}//end of if-else 
			 		    
			 		 }//end of for 
	 		}//end of case 
	 		 
	 					break;
	 
	 
	 case 2:   {	Trains train = null;
	 				int num = train.numOfTrains("trains.txt");
					train.read("trains.txt");
					System.out.println("Please enter your departure station:");
					String departure = sc.next();
					System.out.println("Please enter your arrival station:");
					String arrival=sc.next();
					
					for (int i =1; i<=num; i++)
					{
						if ((train.getIntercityStops().get(0)== departure)||(train.getAllStops().get(0)==departure)) {
							/**
							 * To check the Intercitys
							 */
							for (int j = 0 ; j <= train.getIntercityStops().size();j++ ) {
								if(train.getIntercityStops().get(j)==arrival) {
									System.out.println(train.toString());
								}
							}//end of for
							/**
							 * To check the sprinters
							 */
							for (int j = 0 ; j <= train.getAllStops().size();j++ ) {
								if(train.getAllStops().get(j)==arrival) {
									System.out.println(train.toString());
								}
							}//end of for
							
						
						
						}	
					}//end of for 
		 
	 			}//end of case 2
	 			break;
	 			
	 case 3: break;
	 
	 
	 }//end of switch 
	 
	 
	 
	 
	 
	 
	}//end of psvm
}
