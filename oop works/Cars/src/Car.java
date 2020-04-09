
public abstract class Car {
	String brand;
	String name;
	String power;
	String price;
	
	public Car(String brand,String name,String power,String price) {
		this.brand=brand;
		this.name=name;
		this.power=power;
		this.price=price;
	}//end of constructor

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public boolean equals(Object other) {
		boolean result =false;
		if(other instanceof Car) {
			Car that =(Car) other;
			if((this.brand==that.brand)&&(this.name==that.name)&&(this.power==that.power)&&(this.price==that.price)) {
				result=true;
			}
		}
		
		return result;
	}//end of equals

	@Override
	public String toString() {
		return "Car brand=" + brand + ", name=" + name + ", power=" + power + ", price=" + price ;
	}
	
	
	public static Car read(String line) {
		if(line.contains("ELECTRIC_CAR")) {
			return Electric.read(line);
		}else if(line.contains("GAS_CAR")) {
			return Gas.read(line);
		}else if(line.contains("HYBRID_CAR")) {
			return Hybrid.read(line);
		}else {
			throw new IllegalArgumentException();
		}
	}//end of read
	
}//end of car class
