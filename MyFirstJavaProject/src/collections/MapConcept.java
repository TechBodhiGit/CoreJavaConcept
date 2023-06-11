package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapConcept {

	public static void main(String[] args) {


		//HashMap
		//Name-Age Pair 
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("Abhi", 26);
		hashMap.put("Sam", 29);
		hashMap.put(null, 60);
		hashMap.put("AAA", null);
		hashMap.put("BBB", null);
		hashMap.put("CCC", null);

		//System.out.println(hashMap.get("Sam")); // 29
		//System.out.println(hashMap.get(null)); // 
		
		

	//	System.out.println(hashMap);

		//Entry Interface to fetch the Keys and Values

		for (Entry<String , Integer> entry : hashMap.entrySet() ) {

			System.out.println("The KEY is : " + entry.getKey());
			
			System.out.println("The VALUE is : " + entry.getValue());	


		}
		
		
		// HASHTABLE - Assignment

	}



}
