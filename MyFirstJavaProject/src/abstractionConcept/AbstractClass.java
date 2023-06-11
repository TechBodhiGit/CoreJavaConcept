package abstractionConcept;


public abstract class AbstractClass {

	public abstract void  abstractMethod(); //Abstract Method
	
	//Concrete Method
	public void concreteMethod() {
		
		System.out.println("This is the concreteMethod of AbstractClass");
		
	};
	

	
	/*
	 * public static void main(String[] args) {
	 * 
	 * //Cannot Create the object of Abstract Class //AbstractClass ac = new
	 * AbstractClass();
	 * 
	 * }
	 */

}
