import java.util.*;

public class ProductList {
	private List<Product> productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	public synchronized void add(Product productToAdd) {
		productList.add(productToAdd);
	}
	public static synchronized void sort(ProductList productList, Comparator<Product> comparator) {
		Collections.sort(productList.productList, comparator);
	}
}//end of ProductList
