package abstractionConcept;

public class NormalClass extends AbstractClass  {

	public static void main(String[] args) {
		
		NormalClass NC = new NormalClass();
		
		//NC.abstractMethod();
		
		NC.concreteMethod();
		
		
	}

	@Override 
	public void abstractMethod() {
		
		System.out.println("This is the abstractMethod of AbstractClass but defined in NormalClass");
	}

	public void concreteMethod() {
		
		System.out.println("This is concreteMethod of NormalClass ");
	}

}
