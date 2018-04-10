
public class SmallCar extends Car{
	String regNo;
	String type;
	String driverName;

	public SmallCar(String type) {
		this.type = "SMALL";
	}
	
	public float calculateFare(float kms) {
		return (smallCarFare*kms)+baseFare;
	}
	
}
