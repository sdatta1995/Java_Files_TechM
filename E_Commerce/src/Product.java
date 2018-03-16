
public class Product{
	private String name;
	private int price;
	private int quantity;
	private float taxPercentage;
	
	Product (String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setTaxPercentage(float taxPercentage){
		this.taxPercentage = 15;
	} 
	
	public float getTaxPercentage() {
		return taxPercentage;
	}
}
