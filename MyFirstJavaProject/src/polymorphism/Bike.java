package polymorphism;

public class Bike extends Automobile {


	@Override
	public void startEngine() {

		System.out.println("The Engine is Starting - BIKE");

	};


	public static void main(String[] args) {

		Bike B = new Bike();
		B.startEngine(); 
		
		

		

	}

}
