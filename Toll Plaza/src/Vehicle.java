
public abstract class Vehicle {
	String Reg_No;
	
	public Vehicle (String Reg_No) {
		this.Reg_No = Reg_No;
	}
	
	public abstract float calcTax (String type, String highway);

}
