package polymorphism;

public class Aeroplane extends Automobile {

	
	
	@Override
	public void startEngine() {

		System.out.println("The Engine is Starting - AEROPLANE");

	};
	
	
	public static void main(String[] args) {
		
		
		Automobile A = new Automobile();
		
		A.startEngine(); // The Engine is Starting - Automobile
		
		Aeroplane AP = new Aeroplane();
		AP.startEngine(); // The Engine is Starting - AEROPLANE
		
		//ClassCastException
		Aeroplane aero = (Aeroplane) new Automobile();
		aero.startEngine();
		
		
	}

}
