
public class Hybrid extends Car {
	String battery;
	String displacement;
	
	public Hybrid(String brand,String name,String power,String price,String battery,String displacement) {
		super(brand,name,power,price);
		this.battery=battery;
		this.displacement=displacement;
	}//end of constructor

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	
	public boolean equals(Object other) {
		boolean result=false;
		if(other instanceof Hybrid) {
			Hybrid that=(Hybrid) other;
			if((this.battery==that.battery)&&(this.displacement==that.displacement)) {
				result=true;
			}
		}
		return result;
	}//end of equals

	@Override
	public String toString() {
		return "Hybrid battery=" + battery + ", displacement=" + displacement + ", brand=" + brand + ", name=" + name
				+ ", power=" + power + ", price=" + price ;
	}
	
	public static Hybrid read(String line) {
		String[] temp =line.split(", ");
		String[] temp2spaces;
		String temp1;
		String temp2;
		
		temp2spaces = temp[0].split(" ");
		temp1=temp2spaces[1];
		
		temp2spaces=temp[5].split(" ");
		
		temp2=temp2spaces[0];
		
		Hybrid h = new Hybrid (temp1 ,temp[1],temp[2],temp[3],temp[4],temp2);
		return h;
	}//end of read
	
}//end of class
