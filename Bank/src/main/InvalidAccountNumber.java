package main;

public class InvalidAccountNumber extends Exception{
	
	private static final long serialVersionUID = 1L;

	InvalidAccountNumber (String error) {
		System.out.println(error);
	}
}
