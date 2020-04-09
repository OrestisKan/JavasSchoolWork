import java.util.*;
import  java.io.*;

public class CDs extends Playlist {
	
	String year;
	
	
	String nameOfCD;
	ArrayList<Songs> list;
	
	
	public CDs(String n , String y ) {
		super();
		nameOfCD =n ;
		year=y;
		
		list = new ArrayList<Songs>();
	}//end of constructor
	
	public String toString() {
		String result="";
		result = nameOfCD + " "+ year +"\n";
		for(int i=0; i< list.size();i++) {
			result = list.get(i).toString() +"\n";
		}//end of for 
		
		return result;		
	}//end of toString
	
	public void addSong(Songs s) {
		list.add(s);
	}

	public String getYear() {
		return year;
	}



	public String getNameOfCD() {
		return nameOfCD;
	}

	public ArrayList<Songs> getList() {
		return list;
	}
	
	
	public CDs readCD (String fileName) {
		try {
			FileReader file = new FileReader(fileName);
			Scanner sc = new Scanner(file);
			sc.next();
			while(sc.next()!= "ADDS") {
				if(sc.next()=="CD") {
					while (sc.next()!="CD") {
						
					}
				}
				
				
				
			}//end of while 
			
			
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}//end of readCD
	
	
	public boolean equals(Object other ) {
		boolean result = false;
		if (other instanceof CDs) {
			CDs that= (CDs) other;
			if(this.nameOfCD==that.nameOfCD) {
				if(this.year==that.year) {
					result = true;
					
				}
				
			}
			
		}
		return result;
		
	}//end of equals 
	
	
}//end of CDs
 