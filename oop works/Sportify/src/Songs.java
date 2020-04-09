import java.util.*;
import  java.io.*;

public class Songs extends CDs {
	Length length;
	String trackNo;
	String title;
	
	/**
	 * This is the constructor of Songs
	 * @param tn
	 * @param t
	 * @param l
	 */
	public Songs(String tn , String t , Length l ,String nameOfCD , String year ) {
		super(nameOfCD,year);
		this.trackNo = tn;
		this.title= t;
		this.length = l;
	}//end of constructor
	
	public String toString() {
		String result="";
		
		result = title +" ("+ length.toString()+")";
		return result;
	}//end of toString
	
	public void readSong(String fileName, String cd) {
		Length k = null;
		
		try {
			
			FileReader file = new FileReader(fileName);
			Scanner sc = new Scanner(file);
			
			sc.next();
			if(sc.hasNext()) {
				if(sc.next()== "CD") {
					sc.next();
					String noc = cd;
					if(sc.next()== noc) {
						String year = sc.next();
						String tempTime;
							String input=sc.nextLine();
							Scanner del = new Scanner(input).useDelimiter(",");
							
							while((del.next()!="CD")||(del.next()!="ADDS")) {
								String n=del.next();
								
								String t=del.next();
								tempTime= del.next();
								String[] parts = tempTime.split(":");
								
								k= new Length(parts[0],parts[1]);
								Songs s=new Songs(n ,t , k ,noc, year );
								this.list.add(s);
								
						}
							del.close();
					}
				}
			}
			
			sc.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	
	}//end of readSong
	
	
	public boolean equals (Object other ) {
		boolean result = false;
		if (other instanceof Songs) {
			Songs that = (Songs) other;
			if(this.length==that.length) {
				if(this.title==that.title) {
					result =true ;
				}
			}
		}
		return result;
	}//end of equals 
	
}//end of Songs class
