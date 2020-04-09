public class iPhone extends Product {
    String modem;
    boolean touch3D;

    public iPhone(String name, String size, String processor, String colour, String memory, String price,String modem,boolean touch3D){
        super(name,size,processor,colour,memory,price);
        this.modem=modem;
        this.touch3D=touch3D;

    }//end of constructor

    public boolean equals(Object other) {
    	boolean result = false;
    	if (other instanceof iPhone) {
    		iPhone that=(iPhone) other;
    		if((that.name==this.name)&&(that.memory==this.memory)&&(this.touch3D==that.touch3D)&&(this.size==that.size)) {
    			result=true;
    		}
    	}
    	
    	return result;
    }

	public String getModem() {
		return modem;
	}

	public boolean isTouch3D() {
		return touch3D;
	}
    
    

}//end of iPhone class
