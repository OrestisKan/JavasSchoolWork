import java.util.*;
public class Sorting extends Thread {
    boolean isRunning;
    private ProductList productList;
	private Comparator<Product> comparator;

	public Sorting(ProductList productList, Comparator<Product> comparator) {
		this.productList = productList;
		this.comparator = comparator;
	}

	public void run() {
		ProductList.sort(productList, comparator);
		System.out.println(productList);
	}
}
