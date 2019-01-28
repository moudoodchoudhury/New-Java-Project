package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is a class implements Map Interface
		// Extends AbstractMap
		// It contains only unique elements
		// Stores the values: Key and Value pair
		// It may have one null key and multiple null values
		// It maintains "no order sequence"
		// HashMap is non-synchronized ---not thread safe
		// Concurrent modification exception ---- Fail ---- Fast condition

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(3, "Java");
		hm.put(4, "JavaScript");
		hm.put(2, "HTML");

		// System.out.println(hm.get(1));
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getValue() + " " + m.getValue());
		}
		// remove:
		hm1.remove(3);
		System.out.println(hm);

		// ---------------------------------------------------------------------------
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Abdul ", 30, "Engineer");
		Employee e2 = new Employee("Sarker", 25, "Pharmacist");
		Employee e3 = new Employee("Islam", 35, "Painter");

		emp.put(1, e2);
		emp.put(2, e3);
		emp.put(3, e1);
		
		//traverse the HashMap:
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee" + " "  + key + " " + "info:");
			System.out.println(e.name + " " + e.age + " " + e.dept );
					
		}

	}

}