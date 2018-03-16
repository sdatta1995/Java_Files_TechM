package main;
import java.util.*;
public class Bank {
	public int minimumBalance;
	public Vector<Account> accounts= new Vector<Account>();
	
	Bank (int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public Account createAccount(String accountNumber, String customerName, boolean isSalaryAccount) throws InvalidAccountNumber {
		Account acc = new Account (accountNumber, customerName, isSalaryAccount);
		if (accounts.add(acc)) {
			depositAmount(acc, minimumBalance);
			return acc;
		}
		else
		return null;
	}
	
	public float depositAmount(Account acc, float amount) {
		acc.setTotalBalance(acc.getTotalBalance()+amount);
		return acc.getTotalBalance();		
	}
	
	public float withdrawAmount (Account acc, float Amount) throws LowBalanceException{
		if (acc.getTotalBalance()-Amount >= minimumBalance) {
			acc.setTotalBalance(acc.getTotalBalance()-Amount);
			return acc.getTotalBalance();	
		}
		else 
			throw new LowBalanceException("You don't have enough balance to withdraw.");
	}
	
	public float enquireBalance(Account acc) {
		return acc.getTotalBalance();
	}
	
	public float generateBonus(Account acc) {
		float increasedSalary = 0;
		if (acc.isSalaryAccount()==false) {
			if (acc.getTotalBalance() <= 50000) {
				increasedSalary = (2*acc.getTotalBalance()/100)+acc.getTotalBalance();
			}
			else {
				increasedSalary = (2*50000/100)+(4*(acc.getTotalBalance()-50000)/100)+acc.getTotalBalance();
			}
			acc.setTotalBalance(increasedSalary);
		}
		else {
			if (acc.getTotalBalance() <= 50000) {
				increasedSalary = (3*acc.getTotalBalance()/100)+acc.getTotalBalance();
			}
			else {
				increasedSalary = (3*50000/100)+(6*(acc.getTotalBalance()-50000)/100)+acc.getTotalBalance();
			}
			acc.setTotalBalance(increasedSalary);
		}		
		return acc.getTotalBalance();
	}
	
	public static void main(String[] args) throws LowBalanceException, InvalidAccountNumber {
		Bank kotak = new Bank(2000);
		Account a1 = kotak.createAccount("SAL12345", "Debanita", true);
		Account a2 = kotak.createAccount("GEN12345", "Debanita", false);
		// Account a3 = kotak.createAccount("ABC34567", "Debanita", true);

		System.out.println("Enquire balance: " +kotak.enquireBalance(a1));
		System.out.println("Enquire balance: " +kotak.enquireBalance(a2));
		System.out.println("After deposit Rs. 20000: " +kotak.depositAmount(a1, 20000));
		System.out.println("Enquire balance: " +kotak.enquireBalance(a1));
		System.out.println("After deposit Rs. 60000: "+kotak.depositAmount(a2, 60000));
		System.out.println("Enquire balance: " +kotak.enquireBalance(a2));

		System.out.println("After withdrawal Rs. 10000: "+kotak.withdrawAmount(a1, 10000));
		System.out.println("Enquire balance: " +kotak.enquireBalance(a1));
		// System.out.println(kotak.withdrawAmount(a2, 61000));

		System.out.println("After generating bonus : "+kotak.generateBonus(a1));
		System.out.println("Enquire balance: " +kotak.enquireBalance(a1));
		System.out.println("After generating bonus : "+kotak.generateBonus(a2));
		System.out.println("Enquire balance: " +kotak.enquireBalance(a2));
	}
}
