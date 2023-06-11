package classConcept;

public class ObjectCreation {

	
	int a = 10;
	int b = 20;
	
	public void methodAdd() {
	
		int c = a+b;
		System.out.println("The add value is:  " + c);
		
	}
	
	
	public void methodAdd2() {
		
		
		
	}
	
	
	

	
	public static void main(String[] args) {
		
		ObjectCreation OC = new ObjectCreation();
		
		System.out.println("The Value of a is   :   " + OC.a);
		System.out.println("The Value of b is   :   "+  OC.b);
		
		OC.methodAdd();
		
		
	}

}
