
public class Electric extends Car {
	String battery;
	
	public Electric(String brand,String name,String power,String price,String battery) {
		super(brand,name,power,price);
		this.battery=battery;
	}//end of constructor

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	public boolean equals(Object other) {
		boolean result=false;
		if(other instanceof Electric) {
			Electric that = (Electric ) other;
			if(this.battery==that.battery) {
				result=true;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "Electric battery=" + battery + ", brand=" + brand + ", name=" + name + ", power=" + power + ", price="
				+ price ;
	}
	
	public static Electric read(String line) {
		String[] temp =line.split(", ");
		String[] temp2spaces;
		String temp1;
		String temp2;
		
		temp2spaces = temp[0].split(" ");
		temp1=temp2spaces[1];
		
		temp2spaces=temp[4].split(" ");
		
		temp2=temp2spaces[0];
		
		Electric e = new Electric(temp1,temp[1],temp[2],temp[3],temp2);
		
		return e;
		
	}
	
	
}//