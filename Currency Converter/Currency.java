class Currency {
	private String countryName;
	private String currencyName;
	private float rateInRs;

	Currency (String countryName, String currencyName, float rateInRs) throws InvalidCountryException{
		CountryValidator cv = new CountryValidator();
		if (cv.isValidCountry(countryName)) {
			this.countryName = countryName;
			this.currencyName = currencyName;
			this.rateInRs = rateInRs;			
		}
		else throw new InvalidCountryException("Please enter a valid country Name");
	}

	
    public String getCountryName() {
        return countryName;
    }
    
    public String getCurrencyName() {
        return currencyName;
    }
    
    public float getRateInRs() {
        return rateInRs;
    }
    
    public String toString() {
        return "Country Name = "+getCountryName()+ "Currency Name = "+getCurrencyName()+ " Currency Value = "+getRateInRs();
    }

}