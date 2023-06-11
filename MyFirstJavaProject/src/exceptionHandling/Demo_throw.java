package exceptionHandling;

public class Demo_throw {
	
	
	
	public static void methodA() {
		
		try {
			
			throw new ArithmeticException("This is my DEMO ArithmeticException ");
			
		} catch (ArithmeticException e) {
			
			
			System.out.println("I caught the ArithmeticExceptionn Created by the USER ");
		}
		
		finally {
			
			System.out.println("I am in the finally block");
		}
		
		System.out.println("I am outside the try-catch-finally-block");
	}
	
	
	

	public static void main(String[] args) {

		methodA();

	}

}
