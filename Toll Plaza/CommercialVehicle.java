public class CommercialVehicle extends Vehicle {
    
    public CommercialVehicle (String regNo) {
        super (regNo);
    }
    float PrivateVehicleTax;
    float calcTax (String type, String highway) {
        
        if (highway.equals("national"))
            PrivateVehicleTax = 150;
            
        else if (highway.equals("state"))
            PrivateVehicleTax = 100;
            
        else if (highway.equals("local"))
            PrivateVehicleTax = 50;
            
        return PrivateVehicleTax;
    }
}