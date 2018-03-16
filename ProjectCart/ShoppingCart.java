
import java.util.*;
public class ShoppingCart implements CartOperations
{
   private float tax_percentage;
   private float invoiceAmount=0;
   List<Product> items = new ArrayList<>();
   public float getInvoiceAmount() {
       return invoiceAmount;
   }
   public float addToCart(Product p) {
      items.add(p);
      float cost = (p.price*p.quantity)+((tax_percentage/100)*p.price*p.quantity);
      invoiceAmount = invoiceAmount + cost;
      return invoiceAmount;
    }
   public ShoppingCart(float tax_percentage)
    {
       tax_percentage = 15;
    }
   public void removeFromCart(Product p) throws ProductException {
        Iterator<Product> it = items.iterator();
        int count = 0;
        while (it.hasNext()) {
            if (it.next().equals(p)) {
                count++;
            }
        }    
            if (count==0) {
                   try {
                throw new ProductException("Cart is empty");
            } catch (ProductException pe) {
                System.out.println(pe);
            }
            }
            else {
                items.remove(p);
                float cost = ((p.price*p.quantity)+((tax_percentage/100)*p.price*p.quantity));
                invoiceAmount = invoiceAmount - cost;
            }
        
    }
   public String toString() {
       String str = "";
       Iterator<Product> itr = items.iterator();
       while (itr.hasNext()) {
           str = str.concat(itr.next().name);
        }
       return str;
    }
    public static void main(String[]args) throws ProductException{
        try {
            Product p1 = new Product ("Keyboard", 400, 2);
        Product p2 = new Product("Pendrive", 300, 2);
        Product p3 = new Product("Camera", 3000, 1);
        CartOperations cart = new ShoppingCart(10);
        
        cart.addToCart(p1);
        cart.addToCart(p2);
        cart.addToCart(p3);
        cart.removeFromCart(p1);
        System.out.println(cart.getInvoiceAmount());
        System.out.println(cart);
    } catch (ProductException pe) {
        System.out.println(pe.getMessage());
    }
    }
}
