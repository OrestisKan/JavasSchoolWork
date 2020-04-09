import java.util.*;
public class HousingApplication {
	public static void main(String[] args) {
		HouseCatalog hc =  HouseCatalog.read("random");
		String print = "Please give your maximum budget in whole euros";
		int budget=0;
		
			System.out.println(print);
			Scanner sc = new Scanner(System.in);
			 budget = sc.nextInt();
		
		
		System.out.println(hc.housesCostAtMost(budget));
		sc.close();
	}//end of psvm
}//end of Housing Application

