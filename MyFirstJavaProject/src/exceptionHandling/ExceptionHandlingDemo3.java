package exceptionHandling;

public class ExceptionHandlingDemo3 {


	//Exception happens at try block but not handled in catch block
	public static void main(String[] args) {


		try {

			String str = null;

			System.out.println(str.length());




		}

		


		catch (NullPointerException e) {

			System.out.println("I am NullPointer Exception");
		}

		catch (Exception e) {

			System.out.println("I caught the ArithmeticExceptionn here: YAay");

		}




		finally 

		{

			System.out.println("I am in the finally Block");

		}

		
		System.out.println("I am the not lines of code --- Outside try-Catch-finally block");
		
		
		
	}

}
