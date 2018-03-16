

public abstract class Vehicle
{
   String regNo;
   
   public Vehicle(String regNo) {
       this.regNo = regNo;
   }
   
   abstract float calcTax(String type, String highway);
}
