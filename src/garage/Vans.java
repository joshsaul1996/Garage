package garage;

public class Vans extends Vehicles {
//////////////////////////Attributes////////////////////////
	String manufacturer;
	String model;
	String type;
	int Wheels;
	int maxLoad;
	
	
	
	
	
/////////////////////////Constructors///////////////////////
	public Vans(int vId, String vColour, String vLicencePlate, String vManufacturer, String vModel, String vType, int vWheels, int vTopSpeed) {
		super(vId, vColour);
		this.licencePlate = vLicencePlate;
		this.manufacturer = vManufacturer;
		this.model = vModel;
		this.wheels = vWheels;
		this.topSpeed = vTopSpeed;
	}




////////////////////////Methods////////////////////////////


}
