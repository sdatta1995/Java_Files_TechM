public abstract class Hotel {
	int custId;
	String custName;
	String email;
	float loyaltyPoints;

	Hotel (int custId, String custName, String email, float loyaltyPoints) throws InvalidEmail{
		if (email.contains("@")) {
			this. custId = custId;
			this.custName = custName;
			this.email = email;
			this.loyaltyPoints = loyaltyPoints;
		}
		else 
			throw new InvalidEmail ("Please enter a valid emailId.");
	}

	public abstract float calculateDiscountedBill();
}

