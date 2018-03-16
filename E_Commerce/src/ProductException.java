
public class ProductException extends Exception{
	
	private static final long serialVersionUID = 1L;

	ProductException(String error){
		System.out.println(error);
	}
}
