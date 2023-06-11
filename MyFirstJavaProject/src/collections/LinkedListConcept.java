package collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<Integer> L = new LinkedList<>();
		
		//adding of elements
		L.add(0, 101);
		L.add(1 ,202 );
		L.add(2, 303);
		
		
		System.out.println(L);
		
		
		
		L.addFirst(30001);
		L.addLast(40001);
		
		System.out.println(L);

	}

}
