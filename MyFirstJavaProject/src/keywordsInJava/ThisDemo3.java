package keywordsInJava;


//To refer the current class constructor
public class ThisDemo3 {

	
	int a;
	int b;
	
	//Default constructor
	
	ThisDemo3(){
		
		this(10,20); //Calling the Parameterized Constructor
		
		System.out.println("I am the Default Constructor");
		
		
		
	}
	
	//Parameterized Constructor
	ThisDemo3(int a, int b){
		
		this.a = a;
		this.b = b;
		
		System.out.println("I am the Parameterized Constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		
		ThisDemo3 demo3 = new ThisDemo3();

	}

}
