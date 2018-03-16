package main;

public class LowBalanceException extends Exception{
	
	private static final long serialVersionUID = 1L;

	LowBalanceException (String error) {
		System.out.println(error);
	}
}
