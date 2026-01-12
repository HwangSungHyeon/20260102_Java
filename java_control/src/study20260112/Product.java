package study20260112;

public class Product {
	
	private String productName;
	private int price;
	private String category;
	private int stock;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", category=" + category + ", stock="
				+ stock + "]";
	}
	
	public Product(String productName, int price, String category, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	
	
	
}
