public abstract class Vehicles {
	String regno;
	public Vehicles (String regno) {
		this.regno = regno;
	}
	abstract float calcTax (String type, String highway);
}

class PrivateVehicle extends Vehicles {
	public PrivateVehicle (String regno) {
		super (regno);
	}
		float tempPrivateTax;
	float calcTax (String type, String highway) {
		if (highway.equals("National"))
			tempPrivateTax = 90;
		else if(highway.equals("State"))
			tempPrivateTax = 60;
		else if(highway.equals("Local"))
			tempPrivateTax = 30;
		return tempPrivateTax;
	}
}

class CommercialVehicle extends Vehicles {
	public CommercialVehicle (String regno) {
		super (regno);
	}
		float tempPrivateTax;
	float calcTax (String type, String highway) {
		if (highway.equals("National"))
			tempPrivateTax = 150;
		else if(highway.equals("State"))
			tempPrivateTax = 100;
		else if(highway.equals("Local"))
			tempPrivateTax = 50;
		return tempPrivateTax;
	}
}

class TollData {
	int totalPrivateCount = 0;
	float totalPrivateTax = 0;
	int totalCommercialCount = 0;
	float totalCommercialTax = 0;
	float tempTax = 0;

	float makeEntry (Vehicles v, String type, String highway) {
		if (type.equals("Private") && highway.equals("National") || highway.equals("State") || highway.equals("Local")) {
			tempTax = v.calcTax(type, highway);
			totalPrivateCount+=1;
			totalPrivateTax = totalPrivateTax + tempTax;
		}

		else if (type.equals("Commercial") && highway.equals("National") || highway.equals("State") || highway.equals("Local")) {
			tempTax = v.calcTax(type, highway);
			totalCommercialCount+=1;
			totalCommercialTax = totalCommercialTax + tempTax;
		}

		else 
		System.out.println("Sorry i cannot find the type or highway");

		tempTax = 0;
		return 0;
		
	}
	int getTotalPrivateCount() {
		return totalPrivateCount;
	}
	float getTotalPrivateTax() {
		return totalPrivateTax;
	}
	int getTotalCommercialCount() {
		return totalCommercialCount;
	}
	float getTotalCommercialTax() {
		return totalCommercialTax;
	}

	public static void main (String[]args) {
		PrivateVehicle pv = new PrivateVehicle("TS08CA1111");
		CommercialVehicle cv = new CommercialVehicle("TS09AB1111");
		TollData td = new TollData();
		td.makeEntry(pv, "Private", "National");
		td.makeEntry(cv, "Commercial", "Local");
		System.out.println("Total private count is: " +td.getTotalPrivateCount());
		System.out.println("Total private vehicle tax is: " +td.getTotalPrivateTax());
		System.out.println("Total Commercial count is: " +td.getTotalCommercialCount());
		System.out.println("Total Commercial vehicle tax is: " +td.getTotalCommercialTax());
	}
}