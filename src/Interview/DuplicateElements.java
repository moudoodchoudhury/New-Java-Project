package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "Java", "JavaScript", "Python", "Ruby", "R", "Go", "Go", "Java", };

		// 1. compare each element (using For loop) : O(nxn) ---- Worst Solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {

					System.out.println("Duplicate Element: " + names[i]);
				}
			}
		}
		System.out.println("__________________________________________________");

		// 2. using HashSet : Java Collection: it contains unique values: -- good
		Set<String> store = new HashSet<String>();
		for (String duplicate : names) {
			if (store.add(duplicate) == false) {
				System.out.println("Duplicate Elements: " + duplicate);
			}
		}
		
		System.out.println("_______________________________________________________");
		// 3. using HashMap:
		  Map<String, Integer>storeMap = new HashMap<String, Integer>();
		  for (String duplicate : names) {
			  Integer count = storeMap.get(duplicate);
			  if (count == null) {
				  storeMap.put(duplicate, 1);
			  }else {
				  storeMap.put(duplicate, ++count);
			  }
		  }
		  Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		  for(Entry<String, Integer> entry: entrySet) {
			  if (entry.getValue() > 1) {
				  System.out.println("Duplicate Element: " + entry.getKey());
			  }
		  }
		  
	}

}
