
public class SedanCar extends Car{
	String regNo;
	String type;
	String driverName;

	public SedanCar(String type) {
		this.type = "SMALL";
	}
	
	public float calculateFare(float kms) {
		return (sedanCarFare*kms)+baseFare;
	}
	
}
