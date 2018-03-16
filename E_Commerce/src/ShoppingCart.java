import java.util.*;
public class ShoppingCart implements CartOperations{
	float invoiceAmount;
	float taxPercentage;
	static ArrayList<Product> list = new ArrayList<Product>();

	public void addToCart(Product p) {
		for (Product x: list)
			list.add(x);
		
		float tempPrice = p.getPrice()*p.getQuantity();
		invoiceAmount += (tempPrice*p.getTaxPercentage()/100)+tempPrice;
	}

	public void removeFromCart(Product p){
		for (Product x: list) {
			try {
			if (list.contains(x))
				list.remove(x);
			else
					throw new ProductException("Product do not exist in cart");
				} catch (ProductException e) {
					e.printStackTrace();
				}
				float tempPrice = p.getPrice()*p.getQuantity();
				invoiceAmount -= (tempPrice*p.getTaxPercentage()/100)+tempPrice;
		}
		
	}

	public float getInvoice(Product p) {
		return invoiceAmount;
	}

	public String toString(Product p) {
		return p.getName()+"\n";
	}
	
	
	public static void main(String[] args) {
		try{
			ShoppingCart sc = new ShoppingCart();
			Product p1 = new Product("Item#1", 100, 1);
			Product p2 = new Product("Item#2", 50, 2);
			Product p3 = new Product("Item#3", 100, 1);
			Product p4 = new Product("Item#4", 50, 2);
			
			sc.addToCart(p1);
			sc.addToCart(p2);
			sc.addToCart(p3);
			
			//Cart:
			for(int i=0; i < list.size(); i++){
				Product pObj = list.get(i);
				if(i!=list.size()-1){
					System.out.print(pObj+", ");
				}
				else{
					System.out.print(pObj);
				}
			}
			System.out.println();	
			
			//Total Amount:
			System.out.println("Total: Rs."+sc.getInvoice(p3)+"/-");
			System.out.println("");
			
			sc.removeFromCart(p3);
			System.out.println("\nUpdated Cart:");
			//Cart after removing item:
			for(int i=0; i < list.size(); i++){
				Product pObj = list.get(i);
				if(i!=list.size()-1){
					System.out.print(pObj+", ");
				}
				else{
					System.out.print(pObj);
				}
			}			
			//Total amount for updated cart:
			System.out.println("\nTotal: Rs."+sc.getInvoice(p4)+"/-");
			System.out.println();
			sc.removeFromCart(p4); //Removing an item not in the list.			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		

	}

}
