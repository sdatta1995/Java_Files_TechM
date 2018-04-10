class RegularCustomer extends Hotel{
	int billNo;
	float grossBillAmount;
	float discount;
	RegularCustomer(int custId, String custName, String email, float loyaltyPoints, int billNo, float grossBillAmount) throws InvalidEmail{
		super (custId, custName, email, loyaltyPoints);
		this.billNo = billNo;
		this.grossBillAmount = grossBillAmount;
	}
	public float calculateDiscountedBill() {
		
			discount = (grossBillAmount*5)/10;
		
		return grossBillAmount-discount;
	}
}