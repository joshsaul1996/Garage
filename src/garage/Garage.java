package garage;

import java.util.ArrayList;

public class Garage {
		
	public ArrayList<Vehicle> garageList;
	
	public void addVehicle(Vehicle v) {
		garageList.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		garageList.remove(v);
	}
	
	public void emptyGarage(Vehicle v) {
		garageList.clear(v);
	}
	
}
