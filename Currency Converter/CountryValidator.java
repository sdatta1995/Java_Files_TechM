import java.util.*;
class CountryValidator {
	static String[] countries = {"US", "Europe", "UK", "Singapore", "Japan"};
	static List<String> list =Arrays.asList(countries);
	public static boolean isValidCountry(String country) {
		if (list.contains(country)) 
			return true;
		else return false;
	}
}