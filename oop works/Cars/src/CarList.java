import java.io.*;
import java.util.*;
public class CarList {
	private List<Car> carList;
	
	
	public CarList () {
		this.carList=new ArrayList<Car>();
	}//end of CarList


	public List<Car> getCarList() {
		return carList;
	}


	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	
	public synchronized void add(Car other) {
		carList.add(other);
	}//end of add
	
	public boolean equals(Object other) {
		boolean result = false;
		int counter=0;
		if(other instanceof CarList) {
			CarList that=(CarList) other;
			if(this.carList.size()==that.carList.size()) {
				for(int i=1;i<=carList.size();i++) {
					if(this.carList.get(i)==that.carList.get(i)) {
						counter++;
					}
				}
			}
			if(this.carList.size()==counter) {
				result=true;
			}
		}
		
		
		return result;
	}
	
	public static CarList read(String fileName) throws FileNotFoundException {   
		CarList cl = new CarList();
		
			FileReader fr =new FileReader(fileName);
			Scanner sc = new Scanner(fr);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				
				cl.add(Car.read(line));
				
			}
			
			sc.close();
			return cl;
		/*}catch(FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}
	
	public String toString() {
		String result="";
		if (carList.size()>=1) {
			for (int i=1;i<=carList.size();i++) {
				result = result+ carList.get(i).toString() + "\n";
			}
		}
		
		return result;
	}
	
}//end of class
