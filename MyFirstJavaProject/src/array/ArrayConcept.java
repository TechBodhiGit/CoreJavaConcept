package array;

public class ArrayConcept {

	public static void main(String[] args) {
		
		String[] Students = new String[5]; //Declare the array
		
		//Initialize the Array using Index position
		Students[0] = "Java";
		Students[1] = "Python";
		Students[2] = "Ruby";
		Students[3] = "PHP";
		Students[4] = "C++";
		
		int arrayLength = Students.length;
		
		
		
		System.out.println("The Size of the Students Array is : " + arrayLength );

		
		for(int i = 0 ; i<arrayLength;i++) {
			
			System.out.println("The " +i+ " element of the Array is : " + Students[i]);
		}
		
		
	}

}
