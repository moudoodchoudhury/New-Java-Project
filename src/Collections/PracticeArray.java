package Collections;

import java.util.ArrayList;

public class PracticeArray {

	public static void main(String[] args) {
		ArrayList<String> xx = new ArrayList<String>();
		xx.add("this is moudood");
		xx.add("40");
		xx.add("NewYork");

		System.out.println(xx);
		System.out.println("Hi..." + xx.get(0));
		System.out.println("My age is " + xx.get(1));
		System.out.println("I lives in " + xx.get(2));

		for (int i = 0; i < xx.size(); i++) {
			System.out.println(xx.get(i));
		}

		ArrayList<String> pp = new ArrayList<String>();
		pp.add("hi");
		pp.add("yes");
		pp.add("no");

		ArrayList<String> qq = new ArrayList<String>();
		qq.add("never");
		qq.add("10");
		qq.add("come");

		pp.addAll(qq);
		for (int i = 0; i < pp.size(); i++) {
			System.out.println(pp.get(i));
		}
		pp.addAll(xx);
		for (int i = 0; i < pp.size(); i++) {
			System.out.println(pp.get(i));
		}
	}

}
