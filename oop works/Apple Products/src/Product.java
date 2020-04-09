public abstract class Product {
    String name;
    String size;
    String processor;
    String colour;
    String memory;
    String price;

    /**
     * Constructor of Product class
     * @param name
     * @param size
     * @param processor
     * @param colour
     * @param memory
     * @param price
     */
    public Product(String name, String size, String processor, String colour, String memory, String price){
       this.name=name;
       this.size=size;
       this.processor=processor;
       this.colour=colour;
       this.memory=memory;
       this.price=price;
    }//end of constructor

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public String getProcessor() {
		return processor;
	}

	public String getColour() {
		return colour;
	}

	public String getMemory() {
		return memory;
	}

	public String getPrice() {
		return price;
	}




}//end of Product class
