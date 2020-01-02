package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		// Static Array
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println(a.length);
		System.out.println(a[3]);

		ArrayList ar5 = new ArrayList();
		ar5.add("Canada");
		ar5.add("Japan");
		ar5.add("Kuwait");
		ar5.add("Dubai");
		
		
		
		System.out.println(ar5);
		
		
		
		
		
		
		// Dynamic Array
		ArrayList ar = new ArrayList();
		ar.add("Moudud"); // 0
		ar.add('A'); // 1
		ar.add(true); // 2
		ar.add(40); // 3
		ar.add(50f); // 4
		
		

		System.out.println(ar.size());
		System.out.println(ar.get(2));

		// 1. For loop:
		// 2. using Iterator

		// 1. for loop:
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// non generic vs generic:

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(55);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("USA");

		// BankAccount class objects:
		BankAccount ac = new BankAccount("Moudud", 236598, 30, "Pharmacist");
		BankAccount ac1 = new BankAccount("Islam", 236597, 28, "Pharmacist");
		BankAccount ac2 = new BankAccount("Mehedi", 236599, 30, "SoftwareEngineer");

		// CreateArrayList:
		ArrayList<BankAccount> xy = new ArrayList<BankAccount>();
		xy.add(ac);
		xy.add(ac1);
		xy.add(ac2);

		// Iterator to traverse the values:
		Iterator<BankAccount> it = xy.iterator();
		while (it.hasNext()) {
			BankAccount ba = it.next();
			System.out.println(ba.name);
			System.out.println(ba.ssn);
			System.out.println(ba.age);
			System.out.println(ba.profession);
		}

		// addAll():
		ArrayList<String> tt = new ArrayList<String>();
		tt.add("Java");
		tt.add("HTML");
		tt.add("CSS");
		tt.add("Python");

		ArrayList<String> yy = new ArrayList<String>();
		yy.add("C++");
		yy.add("JavaScript");
		yy.add(".Net");
		yy.add("C");

		tt.addAll(yy);
		for (int i = 0; i < tt.size(); i++) {
			System.out.println(tt.get(i));
		}
		
		
		System.out.println("________________________________________________________");
		// removeAll():
		tt.removeAll(yy);
		for (int i = 0; i < tt.size(); i++) {
			System.out.println(tt.get(i));
		}
		System.out.println("________________________________________________________");
		// retainAll():
		ArrayList<String> xx = new ArrayList<String>();
		xx.add("bangladesh is beautiful");
		xx.add("Coxsbazar sea beach largest beach in the world");
		xx.add("Tea place is Srimangal");

		ArrayList<String> zz = new ArrayList<String>();
		zz.add("bangladesh is beautiful");
		zz.add("Miami sea beach largest beach in the world");
		zz.add("Niagara place is awosome");

		xx.retainAll(zz);
		for (int j = 0; j < xx.size(); j++) {
			System.out.println(xx.get(j));
		}

	}
}
