
public class Gas extends Car{
	String displacement;
	
	public Gas(String brand,String name,String power,String price,String displacement) {
		super(brand,name,power,price);
		this.displacement=displacement;
		
	}//end of constructor

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	
	public boolean equals(Object other) {
		boolean result = false;
		if(other instanceof Gas) {
			Gas that = (Gas) other;
			if(this.displacement==that.displacement) {
				result=true;
			}
		}
		
		
		return result;
	}//end of equals

	@Override
	public String toString() {
		return "Gas displacement=" + displacement + ", brand=" + brand + ", name=" + name + ", power=" + power
				+ ", price=" + price ;
	}
	
	public static Gas read(String line ) {
		String[] temp =line.split(", ");
		String[] temp2spaces;
		String temp1;
		String temp2;
		temp2spaces = temp[0].split(" ");
		temp1=temp2spaces[1];
		
		temp2spaces=temp[4].split(" ");
		
		temp2=temp2spaces[0];
		
		Gas g = new Gas(temp1,temp[1],temp[2],temp[3],temp2);
		return g;
	}//end of read
	
	
	
	
}//end of class
