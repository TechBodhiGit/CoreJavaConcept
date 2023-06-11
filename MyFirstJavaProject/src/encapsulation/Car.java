package encapsulation;

public class Car {
	
	private String brand;
	
	private String model;
	
	private String colour;
	
	private int yearOfMfg;
	
	
	
	
	public void funMethod() {
		
		System.out.println("TIMEPASS");
	};
	
	
	//#########################################################
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	
//#########################################################

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	//#########################################################
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	//#########################################################
	
	public int getYearOfMfg() {
		return yearOfMfg;
	}

	public void setYearOfMfg(int yearOfMfg) {
		this.yearOfMfg = yearOfMfg;
	}
	
	

}
