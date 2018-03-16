public class TollData {
    
    int totalPrivateCount = 0;
    float totalPrivateTax = 0;
    int totalCommercialCount = 0;
    float totalCommercialTax = 0;
    //float tempTax = 0;
    
    float makeEntry(Vehicle v, String type, String highway) {
        if (type.equals("Private") && highway.equals("national") || highway.equals("state") || highway.equals("local"))
        {
            
            totalPrivateTax = v.calcTax(type, highway);
            totalPrivateCount+=1;
            
            //totalPrivateTax = totalPrivateTax + tempTax;
        }
        
        else if (type.equals("Commercial") && highway.equals("national") || highway.equals("state") || highway.equals("local"))
        {
            totalCommercialTax = v.calcTax(type,highway);
            totalCommercialCount+=1;
            
            //totalCommercialTax = totalCommercialTax + tempTax;
        }
        
        else {
        System.out.println("I am not smart enough to find the Vehicle type or highway. Let this vehicle go..");
        }
        
        return 0;
        
    }
    
     int getTotalPrivateCount () 
     {
         return totalPrivateCount;
     }
     
     float getTotalPrivateTax () {
         return totalPrivateTax;
     }
     
     int getTotalCommercialCount () {
         return totalCommercialCount;
     }
     
     float getTotalCommercialTax () {
         return totalCommercialTax;
     }
     
     public static void main (String []args) {
         try {
         PrivateVehicle pv = new PrivateVehicle ("TS08CA1111");
         CommercialVehicle cv = new CommercialVehicle ("TS09AB1111");
         TollData td = new TollData();
         td.makeEntry(pv, "Private", "national");
         td.makeEntry(cv, "Commercial", "local");
         System.out.println("Total Private count is:" +td.getTotalPrivateCount());
         System.out.println("Total Private tax is:" +td.getTotalPrivateTax());
         System.out.println("Total Commercial count is:" +td.getTotalCommercialCount());
         System.out.println("Total Commercial tax is:" +td.getTotalCommercialTax());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
}