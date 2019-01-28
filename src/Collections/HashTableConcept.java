package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		// It is similar to HashMap, but it is synchronized
		// Stores the value on the basis of key-value
		// key-->Object ----HashCode--->value

		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Paracetamol");
		h1.put(2, "Advil");
		h1.put(3, "Ranitidin");

		// create a clone copy/shallow copy:
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2 = (Hashtable) h1.clone();

		System.out.println("The value from h1: " + h1);
		System.out.println("The value from h2: " + h2);

		// clear:
		h1.clear();
		h2.clear();
		System.out.println("The value from h1: " + h1);
		System.out.println("The value from h2: " + h2);

		// contains value:
		Hashtable<String, String> st = new Hashtable<String, String>();
		st.put("A", "Mehedi");
		st.put("B", "Manager");
		st.put("C", "Selenium");

		if (st.contains("Manager"))
			System.out.println("The value is found");

		// print all the values from HashTable using ---- Enumeration ---elements:\
		Enumeration<String> e = st.elements();
		System.out.println("Print values from Enumeration:::");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		// print all the values from HashTable using ---- EntrySet --set of HashTable values:\
		System.out.println("Print values from EntrySet:::");
		Set d = st.entrySet();
		System.out.println(d);
	System.out.println("____________________________________________________________________");
		Hashtable<String, String> st1 = new Hashtable<String, String>();
		st1.put("A", "Moudud");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");  // it contains unique value from common
		//st1.put("D", null); //// no null key and null values---null pointer exception
	
		System.out.println(st1);
		System.out.println(st1.get("A"));
	}
	
	

}
