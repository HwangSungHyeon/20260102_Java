package study20260114;

public class Item {
	
	private String name;
	private int price;
	private String mainImage;
	private int stock;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMainImage() {
		return mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", mainImage=" + mainImage + ", stock=" + stock + "]";
	}
	
	public Item() {
		super();
	}
	public Item(String name, int price, String mainImage, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.mainImage = mainImage;
		this.stock = stock;
	}
	
	
}
