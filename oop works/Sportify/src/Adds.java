import java.util.*;
import  java.io.*;
public class Adds  {
	String advertiser;
	Length length;
	ArrayList<Adds> listAdds;
	
	/**
	 * This is the constructor of Adds
	 * @param adv
	 * @param l
	 */
	public Adds(String adv , Length l ) {
	
		this.advertiser=adv;
		this.length=l;
	}//end of constructor
	
	public String toString() {
		String result = "";
		
		result = advertiser +" ("+length.toString()+")";
		return result;
	}
		
	
	public void readAdds(String fileName) {
		Length k = null;
		
		try {
			FileReader file = new FileReader(fileName);
			Scanner sc = new Scanner(file);
			String tempTime;
			while(sc.next()!="ADDS") {
				sc.next();
			}//end of while
			while(sc.hasNext()) {
				sc.next();
				String input=sc.nextLine();
				Scanner del = new Scanner(input).useDelimiter(",");
					String n= del.next();
					tempTime= del.next();
					String[] parts = tempTime.split(":");
					
					k = new Length(parts[0],parts[1]);
					
					Adds add=new Adds (n , k);
					
					this.listAdds.add(add);
					
				
				del.close();
			}//end of while
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//end of readAdds
	
	public boolean equals(Object other) {
		boolean result = false ;
		if (other instanceof Adds) {
			Adds that = (Adds) other ;
			if (this.advertiser==that.advertiser) {
				if(this.length==that.length) {
					if(this.listAdds==that.listAdds) {
						result = true;
					}
					
				}
				
			}
			
		}//end of outter if 
		
		return result;
	}//end of equals method 
}//end of Adds class
