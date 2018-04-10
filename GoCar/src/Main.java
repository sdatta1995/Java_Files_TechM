
public class Main {

	public static void main(String[] args) throws CarNotFoundException{
		CarManager cm = new CarManager();
		SedanCar se_car = new SedanCar("SEDAN");
		cm.loadCarDetails("car_db.txt");
		cm.addCar("tn -03-ub -1234", se_car);
		cm.findCar("SEDAN");
		se_car.calculateFare(120);
	}

}
