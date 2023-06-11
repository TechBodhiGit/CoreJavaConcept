package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {

		int age = 30;
		int height = 60;


		if(age==20) {

			if(height == 30) {

				System.out.println("Both the conditions are true --- SO I am executed");
			}

			else {

				System.out.println("This is Nested ELSE Statement");
			}


		}

		else {


			System.out.println("This is the OUTER else statement");
		}



	}

}
