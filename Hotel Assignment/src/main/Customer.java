package main;
public abstract class Customer {
	int custId;
	String custName;
	String email;
	float loyaltyPoints;
	
	Customer (int custId, String custName, String email, float loyalty) throws InvalidEmail{
		if (email.contains("@")){
			this.email = email;
			this.custId = custId;
			this.custName = custName;
			this.loyalty = loyalty;
		}
		else 
			throw new InvalidEmail ("Please enter a valid email.");
	}
	public abstract float calculateDiscountBill();
}
