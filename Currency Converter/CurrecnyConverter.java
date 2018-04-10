public class CurrecnyConverter
{
    public static void main(String args[]) throws InvalidCountryException 
	{
		Operations op = new Operations();
		
		Currency c1 = new Currency("US", "US Dollar", 65.35f);
		Currency c2 = new Currency("UK", "British Pound", 84.41f);
		Currency c3 = new Currency("Europe", "Euro", 74.89f);
		Currency c4 = new Currency("Singapore", "Singapore Dollar", 47.16f);
		Currency c5 = new Currency("Japan", "Yen", 0.51f);

		op.addToList(c1);
		op.addToList(c2);
		op.addToList(c3);
		op.addToList(c4);
		op.addToList(c5);
		
		float amount = op.convertToRupees(200, "US");
		System.out.println("Conversion of UK 200 British Pound is : "+amount);
		
		String currency=op.getCurrencyByCountryName("Singapore");
		System.out.println("Currency is : "+currency);
		
		float amt = op.convertToRupees(200, "UK");
		float min=op.getMinValue();
		System.out.println("Minimum Rate in Rupee : "+min);

	}
}
