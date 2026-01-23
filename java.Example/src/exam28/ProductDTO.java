package exam28;

public class ProductDTO {
	
	private String productName;
	private int productPrice;
	private int productCount;
	private int total;
	
	public ProductDTO(String productName, int productPrice, int productCount) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount  = productCount;
		this.total = productPrice * productCount;
	}
	
	//method
	public void display() {
		System.out.printf("%s\t%d\t%d\t%d\n", productName, productPrice, productCount, total);
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		productCount = productCount;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
