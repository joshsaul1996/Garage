package garage;

public class Motorcycle extends Vehicle{
	
//////////////////////////Attributes////////////////////////
	String licencePlate;
	String manufacturer;
	String model;
	int wheels;
	int topSpeed;
	
	
	
	
	
/////////////////////////Constructors///////////////////////
	public Motorcycle(int vId, String vColour, String vLicencePlate, String vManufacturer, String vModel, String vType, int vWheels, int vTopSpeed) {
		super(vId, vColour);
		this.licencePlate = vLicencePlate;
		this.manufacturer = vManufacturer;
		this.model = vModel;
		this.wheels = vWheels;
		this.topSpeed = vTopSpeed;
	}
		
		




////////////////////////Methods////////////////////////////

}
