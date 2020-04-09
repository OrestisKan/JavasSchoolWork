public class iPad extends Product {
    boolean is4G;

    public iPad(String name, String size, String processor, String colour, String memory, String price,boolean is4G){
        super(name,size,processor,colour,memory,price);
        this.is4G=is4G;
    }

    public boolean equals(Object other) {
    	boolean result = false;
    	if (other instanceof iPad) {
    		iPad that =(iPad) other;
    		if((that.name==this.name)&&(that.memory==this.memory)&&(that.is4G==this.is4G)&&(this.size==that.size)){
    			result=true;
    		}
    	}
    	
    	return result;
    }//end of equals

	public boolean isIs4G() {
		return is4G;
	}
    
    
    
}//end of iPad class
