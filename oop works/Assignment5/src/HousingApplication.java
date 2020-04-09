import java.io.FileReader;
import java.io.*;
import java.util.Scanner;
public class HousingApplication {
	public static void main (String[] args ) {
		System.out.println("Do you want to add houses or see the existing ones ? ");
		System.out.println("Type  1 to add Type 2 to read");
		Scanner scr = new Scanner (System.in);
		
		int readOrWrite = scr.nextInt();
		if (readOrWrite ==1) {
			System.out.println("OwnerOccupied =1 or Rental=2");	
			int choice = scr.nextInt();
			switch (choice) {
			
			case 1:	{try {
								
								FileWriter input = new FileWriter("random", true);
								BufferedWriter bw = new BufferedWriter(input);
								
								System.out.println("Please enter the street");
								String street = scr.nextLine();
								System.out.println("Please enter the house number");
								String housenum = scr.next();
								System.out.println("Please enter the postal code");
								String postalCode = scr.next();
								System.out.println("Please enter the city");
								String city = scr.next();
								System.out.println("Please enter the number of rooms,");
								String numofrooms = scr.next();
								System.out.println("Please enter the price in whole euros ");
								String price = scr.next();
								System.out.println("Please enter the type of the heating system");
								String heatingSystem = scr.next();
								System.out.println("Please enter whether is for sale or rent");
								String state= scr.next();
								
								
								bw.write(state);
								bw.newLine();
								bw.write(street+ " ");
								bw.write(housenum);
								bw.newLine();
								bw.write(postalCode + " ");
								bw.write(city);
								bw.newLine();
								bw.write(numofrooms +" rooms");
								bw.newLine();
								bw.write("saleprice "+ price);
								bw.newLine();
								bw.write(heatingSystem);
								bw.newLine();
								
								bw.close();
							}catch (IOException e) {
								e.printStackTrace();
							}
					}//end of case 1 
					break;
			
					
			case 2:	{try {
				
								FileWriter input = new FileWriter("random", true);
								BufferedWriter bw = new BufferedWriter(input);
								
								System.out.println("Please enter the street");
								String street = scr.next();
								System.out.println("Please enter the house number");
								String housenum = scr.next();
								System.out.println("Please enter the postal code");
								String postalCode = scr.next();
								System.out.println("Please enter the city");
								String city = scr.next();
								System.out.println("Please enter the number of rooms,");
								String numofrooms = scr.next();
								System.out.println("Please enter the price in whole euros ");
								String price = scr.next();
								System.out.println("Please enter the type of the heating system");
								String heatingSystem = scr.next();
								System.out.println("Please enter whether is for sale or rent");
								String state= scr.next();
								
								
								bw.write(state);
								bw.newLine();
								bw.write(street+ " ");
								bw.write(housenum);
								bw.newLine();
								bw.write(postalCode + " ");
								bw.write(city);
								bw.newLine();
								bw.write(numofrooms +" rooms");
								bw.newLine();
								bw.write("saleprice "+ price);
								bw.newLine();
								bw.write(heatingSystem);
								bw.newLine();
						
						bw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
	}//end of case 1 
	break;		
			
			}//end of switch
		}else if (readOrWrite == 2){
			
			System.out.println("What should the maximum price be? (0 means all houses) ");
			int price = scr.nextInt();
			System.out.println("What is the minimum energy efficiency? (E means all houses)");
			String energy = scr.next();
			System.out.println("what is the numbers of rooms that you want");
			int noofrooms = scr.nextInt();
//			System.out.println("Should the house be for sale or for rent?");
//			String state = scr.next();
			System.out.println("Should the house be available right now? ");
			int availably = scr.nextInt();
			
			
			for (int i =1 ; i <= House.readNumOfHouses("random");i++) {
				House house =House.read("random");
				if (price <= house.salePrice) {
					//if(energy == house.heatingsystem.getEnergyEfficiency(noofrooms)) {
							if (house.available =true) {
									int temp =1;
									if(availably ==1) {
							
							String out =house.toString();
							System.out.println(out + " \n");
							
						}
							}
				//	}
				}
				
				
			}//end of for 
		
		
		
		}//end of if-else
		
		
	scr.close();
	
	}//end of psvm
}//end of Housing application class
