package com.intertech.qa;

public class AnotherReverseString {

	public static void main(String[] args) {
		String name = "Samad";

		StringBuffer s = new StringBuffer(name);
		System.out.println(s.reverse());
		System.out.println("---------------");

		String name1 = "Mehedi";

		StringBuffer d = new StringBuffer(name1);
		System.out.println(d.reverse());

		System.out.println("======================");

		String no = "1234";

		StringBuffer f = new StringBuffer(no);
		System.out.println(f.reverse());

	}

}
