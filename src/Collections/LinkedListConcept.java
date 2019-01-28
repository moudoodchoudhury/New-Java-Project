package Collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// Comment all ---- (Highlighted mouse) + ctrl + ?/ ---//
		// Uncomment all --- (Highlighted mouse) + ctrl + ?/

		// Comment all ---- (Highlighted mouse) + ctrl + shift + ?/ --/* */
		// Uncomment all --- (Highlighted mouse) + ctrl + shift + |\

		// add:
		ll.add("Canada");
		ll.add("Japan");
		ll.add("Kuwait");
		ll.add("Dubai");
		
	

		System.out.println("Content of LinkedList:" + ll);

		// addFirst:
		ll.addFirst("United");
		// addLast
		ll.addLast("Bangladesh");
		System.out.println("Content of LinkedList: " + ll); // [United, Canada, Japan, Kuwait, Dubai, Bangladesh]

		// get:
		System.out.println(ll.get(2));  // Japan

		// remove first and last element:
		ll.removeFirst();
		ll.removeLast();

		System.out.println("Content of LinkedList: " + ll); //Canada, Japan, Kuwait, Dubai
		
		ll.remove(2);
		System.out.println("Content of LinkedList: " + ll);
		
		System.out.println(ll.size());
		
		System.out.println("_____________________________________");
		
		
		System.out.println(ll);
		
		//for loop
		for(int i = 0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("______________________________________");
		
		System.out.println();
		//Advance for loop:
		for(String sr : ll) {
			System.out.println(sr);
		}
		
		
		
	}

}
