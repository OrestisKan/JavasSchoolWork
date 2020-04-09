import java.util.*;
public class ComparePrice implements Comparator<Product> {
	@Override
	public int compare(Product a, Product b) {
		if (Integer.parseInt(a.price)>Integer.parseInt(b.price)) {
			return 1;
		}else if(Integer.parseInt(a.price)==Integer.parseInt(b.price)){
			return 0;
		}else {
			return -1;
		}
			
	}//end of compare
}//end of compare price
