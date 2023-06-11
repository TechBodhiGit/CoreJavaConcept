package exceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		
		
		//When exception occurs in try block and handled in catch block
		try {
			
			String str = null;
			
			int str_length = str.length();
			
			System.out.println(str_length);
			
			
			
		} 
		
		catch (NullPointerException e) {
			
			System.out.println("NullPointerExceptionn is handled in Catch Block");
			
		}

	}

}
