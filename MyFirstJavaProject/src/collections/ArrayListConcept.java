package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<String>(); //Syntax for creating a ArrayList object

		//Add the elements in ArrayList
		arrList.add(0, "JAVA");
		arrList.add(1, "PYTHON");
		arrList.add(2, "JAVA");
		arrList.add(3, "RUBY");
		arrList.add(4, "SELENIUM");

		System.out.println(arrList);
		
		
		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add(0, "Tech BODHI");
		arrList2.addAll(arrList); //Adding all the elements of arrList to arrList2
		System.out.println(arrList2);
		

		System.out.println("###############################################");


		arrList.remove(4); //remove SELENIUM

		System.out.println(arrList);

		System.out.println("###############################################");


		System.out.println("The element at 0th Index is : " + arrList.get(0));; //Fetch any element 

		System.out.println("###############################################");


		int arrayLength = arrList.size(); //Find the size of the arrList
		System.out.println("The Size of the arrList is  " + arrayLength);


		System.out.println("###############################################");

		//Iterate the elements of ArrayList
		//1.	Simple For loop
		//2. 	Advanced For loop
		//3. 	Iterator Interface and iterator() method.
		
		
		System.out.println("Using Simple For Loop");


		for(int i = 0 ; i<arrayLength ; i++) {
			
			System.out.println("The " + i + " element of arrList is  " +arrList.get(i));
		}

		System.out.println("###############################################");
		System.out.println("Using Advanced For Loop -- For-each loop");

		for(String A1 : arrList ) {
			
			System.out.println(A1);
		}


		System.out.println("###############################################");
		System.out.println("Using Iterator");

		Iterator<String> I = arrList.iterator();
		
		while(I.hasNext()) {
			
			System.out.println(I.next());
		}











	}






}
