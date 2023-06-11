package classConcept;

public class ConstructorConcept {


	//Default Constructor
	public ConstructorConcept() {

		System.out.println("This is the Default Constructor");


	}


	//Param Constructor
	public ConstructorConcept(int i , int j) {
		
		System.out.println("The first value is "  + i);
		
		System.out.println("The first value is " + j);
		
	}

	//Param Constructor
		public ConstructorConcept(String name) {
			
			System.out.println(name);
			
			
		}
	
	

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(100, 500);
		ConstructorConcept obj3 = new ConstructorConcept("SELENIUM");
		
		








	}

}
