
public class StringList {

	 private String[] elements;
	 private int amount;
	 
	 public StringList(int n) {
		 amount=0;
		 if(n>0) {
			String[] elements = new String[n]; 
		 }else {
			 String[] elements = new String[0];
		 }//end of if-else
		 
	 }//end of String List constructor
	
	 
	 public void add(String el) {
		if (amount<elements.length) {
			elements[amount]=el;
			amount++;
		}else {
			throw new IllegalArgumentException();
		}//end of if -else 
		  
	 }//end of add method 
	
	 public String get(int i) {
		 String ans ;
		 if ((i>=0)&&(i<amount)) {
			 ans=elements[i];
		 }else {
			 ans="";
		 }//end of if-else 
		 return ans;
	 }//end of get method 
	 
	 public void set(int i, String el) {
		 if ((i>=0)&&(i<amount)) {
			 elements[i]=el;
		 }else {
			 throw new IllegalArgumentException();
		 }//end of set method 
	 }//end of set method 
	 
	 public int index(String el) {
		 boolean flag=false;
		 int i = 0;
		 while((i<amount)&&(flag=false)) {
			 if (elements[i]==el) {
				 flag=true;
				 i=i-1;
			 }//end of if 
			 	i++;
			 
		 }//end of while loop 
		 if(flag=true ) {
			 return i;
		 }else {
			return -1; 
		 }//end of if-else
		 
	 }//end of index method 
	 
	 public boolean contains(String el) {
		boolean flag=false; 
		int i =0;
		while((i<amount)&&(flag=false)) {
			if (elements[i]==el) {
				flag=true;
	
			}//end of if
			i++;
			
		}//end of while loop
	 
		return flag;
	 }//end of contains method 
	 
	 public int getSize() {
		 return elements.length;
	 }//end of get size method 
	 
	 public boolean equals(Object other) {
		 boolean ans =false;
		 if ((other instanceof StringList )&&(other.getClass().isArray())) {
			ans=true; 
		 }//end of if
		 
		 return ans ;
	 }//end of equals method 
	 
	 public String toString() {
		return "Array with " + elements.length +" elements";
		
	 }//end of toString
	 
	 
	 
	 
	 
	 
}//end of StringList class
