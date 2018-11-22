package garage;

public class Car extends Vehicle {
	
//////////////////////////Attributes////////////////////////
	String licencePlate;
	String manufacturer;
	String model;
	String type;
	int wheels;
	int maxPeople;
	
	
	
	
	
	
	
/////////////////////////Constructors///////////////////////

	public Car(int vId, String vColour, String vLicencePlate, String vManufacturer, String vModel, String vType, int vWheels, int vMaxPeople) {
		super(vId, vColour);
		this.licencePlate = vLicencePlate;
		this.manufacturer = vManufacturer;
		this.model = vModel;
		this.type = vType;
		this.wheels = vWheels;
		this.maxPeople = vMaxPeople;
		
	}

////////////////////////Methods////////////////////////////


}
