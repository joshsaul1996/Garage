package garage;

public abstract class Vehicle {
	
	
	
	
	//////////////////////////Attributes////////////////////////
	 int id;
	 String colour;
	
	/////////////////////////Constructors///////////////////////
	public Vehicle(Integer vId) {
		this.id = vId;
		this.colour = "None";
				
	}
	
	public Vehicle(Integer vId, String vColour) {
		this.id = vId;
		this.colour = vColour;
	}
		
	
	////////////////////////Methods////////////////////////////
	
	

}
