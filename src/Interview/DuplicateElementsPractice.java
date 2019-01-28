package Interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsPractice {

	public static void main(String[] args) {

		String Batsman[] = { "anwar", "abdul", "rasul", "abdul", "samad" };

		Set<String> obj = new HashSet<String>();
		for (String duplicate : Batsman) {
			if (obj.add(duplicate) == false) {
				System.out.println("Dulicate Elemenets: " + duplicate);
			}
		}
	}
}