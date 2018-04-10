
public abstract class Car {
	float smallCarFare = 10.00f;
	float sedanCarFare = 15.00f;
	int baseFare = 50;
	String regNo;
	String type;
	String driverName;
	
	public abstract float calculateFare(float kms);
	
	public String getRegNo() {
		return regNo;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getDriverName() {
		return this.driverName;
	}
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void setDriverName(String driverName) {
		// TODO Auto-generated method stub
		this.driverName = driverName;
	}
}
