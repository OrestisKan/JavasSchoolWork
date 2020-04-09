import java.util.*;
import  java.io.*;

public abstract class  Playlist {
	ArrayList<CDs> CDList ;
	ArrayList<Adds> AddsList;
	
	
	public Playlist() {
	
		
	}//end of constructor 
	
	public  void addCD(String fileName) {
		CDs c=null;
		
		CDList.add(c.readCD(fileName));
		
	}
	
	public boolean equals(Object other) {
		boolean result =false;
		if (other instanceof Playlist) {
			result = true;
		}
			
			
		return result;
	}//end of equals 
	
	
}//end of Playlist class 
