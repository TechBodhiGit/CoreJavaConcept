package keywordsInJava;

public class StaticBlockDemo {

	static int a = 100;

	static int b ;

	static {

		System.out.println("Initializng Static Block");
		b = a * 400;

	}


	public static void main(String[] args) {

		System.out.println("Emtering the main method");
		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);

	}

}
