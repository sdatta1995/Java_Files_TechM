class ExecutiveCustomer extends Hotel{
	int billNo;
	float grossBillAmount;
	float discount;
	ExecutiveCustomer(int custId, String custName, String email, float loyaltyPoints, int billNo, float grossBillAmount) throws InvalidEmail{
		super (custId, custName, email, loyaltyPoints);
		this.billNo = billNo;
		this.grossBillAmount = grossBillAmount;
	}
	public float calculateDiscountedBill() {
		if (loyaltyPoints < 5000)
			discount = (grossBillAmount*3)/10;
		else if (loyaltyPoints >= 5000)
			discount = (grossBillAmount*5)/10;
		
		return grossBillAmount-discount;
	}
}