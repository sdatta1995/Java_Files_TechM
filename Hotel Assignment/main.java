public class main{
	public static void main(String[] args) throws InvalidEmail {
		Hotel2 hotel = new Hotel2(100);
		Hotel c1 = new ExecutiveCustomer(1,"Amit","abc@gmail.com",99,1,1000);
		System.out.println(hotel.generateFinalBill(c1));
		System.out.println(c1.loyaltyPoints);
		System.out.println(hotel.incrementLoyalty(c1));
		
		Hotel ex1 = new ExecutiveCustomer(1, "Amit", "abc@gmail.com", 4999, 1, 1000);
		System.out.println(hotel.generateFinalBill(ex1));
		System.out.println(ex1.loyaltyPoints);
		System.out.println(hotel.incrementLoyalty(ex1));
		
		Hotel reg1 = new RegularCustomer(1, "Amit", "abc@gmail.com", 5001, 1, 2000);
		System.out.println(hotel.generateFinalBill(reg1));
		System.out.println(reg1.loyaltyPoints);
		System.out.println(hotel.incrementLoyalty(reg1));
		//Hotel c2 = new ExecutiveCustomer(1, "Amit", "abc$gmail.com", 99, 1, 1000);
	}
}