package keywordsInJava;

public class ChildClass_super extends ParentClass_super {

	
	
	  ChildClass_super(){
	  
	  super();
	  
	  System.out.println("I am the constructor of ChildClass_super");
	  
	  };
	 
	
	int b = 100 * super.a;
	
	
	public void methodChildClass() {
		
		super.methodParent();
		
		System.out.println("I am the methodChildClass of ChildClass_super ");
	}
	

	
	
	
	public static void main(String[] args) {
		
		ChildClass_super C = new ChildClass_super();
		C.methodChildClass();
		
		System.out.println("The Value of the varibale b is : " + C.b);
		
		
	}

}
