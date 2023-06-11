package encapsulation;

public class CarUser {

	
	public static void main(String[] args) {
		
		//Create and initialize the Objects
		
		Car C = new Car();
		C.setBrand("BMW");
		System.out.println("The brand of the CAR is : " + C.getBrand());
		
		
		C.setColour("RED");
		System.out.println("The Colour of the CAR is : " + C.getColour());
		
		C.setModel("320d Series");
		System.out.println("The Model of the CAR is : " + C.getModel());
		
		C.setYearOfMfg(2023);
		System.out.println("The Model of the CAR is : " + C.getYearOfMfg());
		
	}
	
	

}
