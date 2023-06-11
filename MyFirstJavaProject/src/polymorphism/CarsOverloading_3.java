package polymorphism;

//Difference in the sequence of the parameters
public class CarsOverloading_3 {

	
	public static void increaseSeatHeight(int var1 , String var2) {


		System.out.println( "Integer " + var1 +" is the 1st parameter" );

	}	
	
	
	public static void increaseSeatHeight(String var1 , int var2) {


		System.out.println( "String --" + var1 +"-- is the 1st parameter" );

	}	
	
	
	
	public static void main(String[] args) {
		
		increaseSeatHeight(100 , "I am String Variable");
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		increaseSeatHeight("I am String Variable" , 1 );
		
		

	}

}
