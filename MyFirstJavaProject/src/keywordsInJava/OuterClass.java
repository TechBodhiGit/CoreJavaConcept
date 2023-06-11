package keywordsInJava;

public  class OuterClass {

	static String str = "Geeky Tech Bodhi";
	
	int var = 100;
	
	
	public static class nestedInnerclass{ 
		 
		public void demoMethod() {
			
			 
			 System.out.println("The Static variable of outer class is " + str );
			 
			//System.out.println("The Non-Static variable of Outer Class is " + var);
			 
		}
		
	
	}
	
	
	  public class NormalInnerclass{
	  
		 
		
			
			  public void demoMethod2() {
			  
			  
			  System.out.println("Static Variable of the outer class is +  " + str); //Static Variable
			  
			  System.out.println("Normal Variable of the calss is + " + var); } //Non Static Variable
			 
	 
	  
	

	
	
	

}
	  
	 
	  }
