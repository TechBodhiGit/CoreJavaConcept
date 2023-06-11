package exceptionHandling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {


		
		
		try {
			
			int [] arr= new int[3];

			arr[0] = 1;
			arr[1] = 2;
			arr[2]= 3;
			arr[3] = 4; //Exception will occur at this line
			
			System.out.println("I am still in the TRY block");
			
			
			
			
			
		} 
		catch (Exception ex) {
			
			System.out.println("Exception Caught --- Yaaay ! ---- ArrayIndexOutOfBoundsExceptionn");
			
			System.out.println(ex.getMessage());
			
			
			ex.printStackTrace();
			
		}
		
		finally {
			
			System.out.println("I am in the finally Block");
		}
	}

}
