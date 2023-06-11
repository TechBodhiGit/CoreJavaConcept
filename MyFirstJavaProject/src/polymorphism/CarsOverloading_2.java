package polymorphism;

//Difference in the Data Type 
public class CarsOverloading_2 {




	public static void increaseSeatHeight(int heightToIncreaseInInches) {


		System.out.println( "This is Integer Data Type ---  Increased the Seat height by :" + heightToIncreaseInInches + " inches!" );

	}	

	public static void increaseSeatHeight(String heightToIncreaseInInches) {


		System.out.println( "This is String Data Type ---  Increased the Seat height by :" + heightToIncreaseInInches + " inches!" );

	}	



	public static void main(String[] args) {
		
		increaseSeatHeight(2);
		System.out.println("###########################");
		increaseSeatHeight("2");
	}

}
