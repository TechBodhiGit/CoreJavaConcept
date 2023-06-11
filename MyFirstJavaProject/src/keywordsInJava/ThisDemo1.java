package keywordsInJava;


//To refer the current class instance variable
public class ThisDemo1 {

	
	
	 int a;
	 int b;
	
	//Parameterized constructor
	
	
	  ThisDemo1(int a, int b){
	  
	  this.a = a; this.b = b;
	  
	  
	  }
	 
	
	public void demoMethod() {
		
		System.out.println("The value of Instance Variable a is : " + a);
		
		System.out.println("The value of Instance Variable b is : " + b);
	}
	
	
	public static void main(String[] args) {

		
		  ThisDemo1 demoObject = new ThisDemo1(200, 500);
		  
		  demoObject.demoMethod();
		 
		
		
	
		

	}

}
