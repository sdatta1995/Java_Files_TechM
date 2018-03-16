

public class PrivateVehicle extends Vehicle
{
    public PrivateVehicle (String regNo) {
        super (regNo);
    }
    float PrivateVehicleTax;
    float calcTax(String type, String highway) {
        if (highway.equals("national")) 
            PrivateVehicleTax = 90;
        
        else if (highway.equals("state")) 
            PrivateVehicleTax = 60;
        
        else if (highway.equals("local")) 
            PrivateVehicleTax = 30;
            
        return PrivateVehicleTax;
        
    }
}
