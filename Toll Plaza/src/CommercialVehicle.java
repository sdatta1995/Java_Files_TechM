
public class CommercialVehicle extends Vehicle{

	public CommercialVehicle(String Reg_No) {
		super(Reg_No);
		
	}

	float tempTax;
	public float calcTax(String type, String highway) {
		
			if (highway.equals("National"))
				tempTax = 50;
			else if (highway.equals("State"))
				tempTax = 100;
			else if (highway.equals("Local"))
				tempTax = 150;
			
		return tempTax;
	}

}
