package array;

public class ArrayConcept2 {

	public static void main(String[] args) {

		int [] ages = {12, 30 , 40 , 50};

		//Simple Print Statement
		System.out.println("The 4th element is :" + ages[3]); //50

		//Simple for Loop 
		for(int i = 0 ; i<ages.length; i++) {

			System.out.println(ages[i]);
		}


		//Advanced for Loop
		
		for(int arr:ages) {
			
			System.out.println("Enhanced For Loop / Advanced For Loop");
			System.out.println("****************************");
			System.out.println(arr);
		}
		

	}

}
