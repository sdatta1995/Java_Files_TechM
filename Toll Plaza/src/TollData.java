
public class TollData {
	
		int totalPrivateCount=0,  totalCommercialCount=0;
		float totalPrivateTax=0, totalCommercialTax=0;
		float tempTax2=0;
		
		 float makeEntry(Vehicle v, String type, String Highway) throws InvalidDetailException{
			tempTax2 = v.calcTax(type, Highway);
			if (type.equals("Private") && Highway.equals("National") || Highway.equals("State") || Highway.equals("Local")) {
				totalPrivateCount+=1;
				totalPrivateTax = totalPrivateTax + tempTax2;
			}
			else if (type.equals("Commercial") && Highway.equals("National") || Highway.equals("State") || Highway.equals("Local")) {
				totalCommercialCount+=1;
				totalCommercialTax = totalCommercialTax + tempTax2;
			}
			else {
				throw new InvalidDetailException("Invalid vehicle/highway");
			}
			tempTax2 = 0;
			return 0;
			}
		 
		 public int getTotalPrivateCount() {
			 return totalPrivateCount;
		 }
		 public float getTotalPrivateTax() {
			 return totalPrivateTax;
		 }
		 public int getTotalCommercialCount() {
			 return totalCommercialCount;
		 }
		 public float getTotalCommercialTax() {
			 return totalCommercialTax;
		 }
		 
	public static void main(String[]args) { try {
		PrivateVehicle pv = new PrivateVehicle("TS08CA1111");
		CommercialVehicle cv = new CommercialVehicle("TS09AB1111");
		TollData td = new TollData();
		td.makeEntry(pv,"Private","National");
		td.makeEntry(cv,"Commercial","Local");
		System.out.println("Total Private Count is:"+td.getTotalPrivateCount());
		System.out.println("Total Private Vehicle Tax:"+td.getTotalPrivateTax());
		System.out.println("Total Commercial Count is:"+td.getTotalCommercialCount()+"\nTotal Commercial Vehicle Tax:"+td.getTotalCommercialTax());
	} catch (Exception e) {
		System.out.println(e.getMessage());}
	}

	
}
