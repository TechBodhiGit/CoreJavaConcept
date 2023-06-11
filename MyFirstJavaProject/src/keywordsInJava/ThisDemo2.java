package keywordsInJava;


//To refer the current class method
public class ThisDemo2 {


	public void show() {


		System.out.println("I am inside the SHOW method");

	//	System.out.println("I am calling the DISPLAY method");

		//this.display();

		System.out.println("I am the SHOW method");

	};


	public void display() {

		System.out.println("I am the DISPLAY method");

		System.out.println("I am calling the SHOW method");

		this.show();
	};



	public static void main(String[] args) {

		ThisDemo2 demo = new ThisDemo2();
		
		demo.display();

	}

}
