class Hotel2 {
	int thresholdLoyalty;

	public Hotel2 (int thresholdLoyalty) {
		this.thresholdLoyalty = thresholdLoyalty;
	}

	public float generateFinalBill(Hotel h) {
		if (h.loyaltyPoints >= thresholdLoyalty)
			return h.calculateDiscountedBill();
		else {
			if (h instanceof ExecutiveCustomer)
				{return ((ExecutiveCustomer)h).grossBillAmount;}
			else
				{return ((RegularCustomer)h).grossBillAmount;}
		}	
	}
	
	public float incrementLoyalty(Hotel h) {
		return h.loyaltyPoints+=10;
	}
}