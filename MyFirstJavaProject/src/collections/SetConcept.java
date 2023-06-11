package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {


		//HashSet 
		//Does not maintain any Insertion Order - Inserts elements Randomly
		HashSet<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(200);
		System.out.println(hashSet.add(200));; //It return false
		hashSet.add(500);
		hashSet.add(600);
		hashSet.add(700);
		hashSet.add(800);
		hashSet.add(900);
		hashSet.add(621);

		System.out.println(hashSet);


		for(Integer I : hashSet) {

			System.out.println(I);
		}



		//LinkedHashSet
		//Maintains the insertion Order

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		//Adding the elements
		linkedHashSet.add(1000);
		linkedHashSet.add(1001);
		linkedHashSet.add(1002);
		linkedHashSet.add(1003);
		linkedHashSet.add(1004);


		System.out.println("#####################################");
		System.out.println("LinkedHashSet");
		System.out.println(linkedHashSet);

		for(Integer I : linkedHashSet) {

			System.out.println(I);
		}

		
		//TreeSet
		//Sorts in Ascending Order
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); 
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(3);
		
		System.out.println("TreeSet");
		System.out.println("#####################################");
		System.out.println(treeSet);
		
		
		
		
		
		
		
		
		
	}

}
