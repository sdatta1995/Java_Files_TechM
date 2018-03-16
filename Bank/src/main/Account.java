package main;

public class Account {
	private String accountNumber;
	private String customerName;
	private float totalBalance;
	private boolean isSalaryAccount;
	
	public Account (String accountNumber, String customerName, boolean isSalaryAccount) throws InvalidAccountNumber{
		if (accountNumber.startsWith("SAL") || accountNumber.startsWith("GEN")) {
			this.accountNumber = accountNumber;
		}else
			throw new InvalidAccountNumber ("Please enter valid account number");
		
		if (accountNumber.startsWith("SAL"))
			this.isSalaryAccount = true;
		else if (accountNumber.startsWith("GEN"))
			this.isSalaryAccount = false;
		
		this.customerName = customerName;
	}
	
	public void setTotalBalance(float totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public float getTotalBalance() {
		return totalBalance;
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
}
