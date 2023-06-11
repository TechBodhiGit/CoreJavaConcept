package polymorphism;

//Different number of parameters in argument list
public class CarsOverloading_1 {




	public static void increaseSeatHeight(int heightToIncreaseInInches) {
		System.out.println("Increased the Seat height by :" + heightToIncreaseInInches + " inches!");

	}	


	public static void increaseSeatHeight(int heightToIncreaseInInches , boolean rememberHeight) {
		
		System.out.println("Increased the Seat height by :" + heightToIncreaseInInches + " inches!");

		if(rememberHeight) {
			System.out.println("The Height is Adjusted and Saved");
		}
		else {
			System.out.println("The Height is NOT  Saved");
		}
	}	

	public static void main(String[] args) {
		
		//Compile Time Polymorphism
		
		increaseSeatHeight(3);
		
		System.out.println("###########################");
		
		increaseSeatHeight(3 , false );
		
		



	}

}
