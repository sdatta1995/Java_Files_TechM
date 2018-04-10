import java.util.*;

class Operations {
	ArrayList<Currency> list = new ArrayList<Currency>();
	//float tempo2;
	public boolean addToList(Currency c) {
		if (list.add(c))
			return true;
		else return false;
	}
	
	public ArrayList<Currency> getList() {
		return list;
	}

	public float convertToRupees (int amountInForeignCurrency, String country) throws InvalidCountryException {
		CountryValidator cv = new CountryValidator();
		float tempo = 0f;
		if (cv.isValidCountry(country)) {
			for (int i=0; i<list.size(); i++) {
				Currency cc = list.get(i);
				tempo = cc.getRateInRs();
			}
		}
		else throw new InvalidCountryException ("Enter valid Country name");
		return (amountInForeignCurrency*tempo);
	}

	public String getCurrencyByCountryName(String country) {
		CountryValidator cv = new CountryValidator();
		String tempo = null;
		if (cv.isValidCountry(country)) {
			for (int i=0; i<list.size(); i++) {
				Currency cc = list.get(i);
				tempo = cc.getCurrencyName();
			}
		}
		
		return tempo;
	}

	public float getMinValue() {		
		float tempo = 0f;		
			for (int i=0; i<list.size(); i++) {
				Currency cc = list.get(i);
				tempo = cc.getRateInRs();
			}		
		return tempo;
	}
}