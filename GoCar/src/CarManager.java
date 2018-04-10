
import java.util.HashMap;
import java.io.*;
public class CarManager {
	
	private HashMap<String, Car> cars = new HashMap<String, Car>();
	
	public boolean loadCarDetails (String file) throws CarNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader("car_db.txt"));
		String line;
		while ((line=br.readLine())!=null) {
			String contents[] = line.split(",");
			String regNo = contents[0].substring(3,18);
			Car car;
			if (contents[1] == "SMALL") {
				car = new SmallCar(null);
				car.setDriverName(contents[2]);
				car.setRegNo(regNo);
				car.setType(contents[1]);
				addCar(regNo, car);
			}
			else if (contents[1] == "SEDAN") {
				car = new SedanCar(null);
				car.setDriverName(contents[2]);
				car.setRegNo(regNo);
				car.setType(contents[1]);
				addCar(regNo, car);
			}
		}
	}
	public void addCar(String regNo, Car car) {
		cars.put(regNo, car);
	}
	
	public Car findCar(String type) throws CarNotFoundException{
		Car car;
		if (type.equals("SMALL")|| type.equals("SEDAN")) {
			return car;
		}
		else 
			throw new CarNotFoundException ("Car not found.");
	}
}
