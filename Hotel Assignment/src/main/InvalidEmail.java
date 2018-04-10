package main;

public class InvalidEmail extends Exception{
	
	private static final long serialVersionUID = 1L;

	InvalidEmail (String error) {
		System.out.println(error);
	}
}
