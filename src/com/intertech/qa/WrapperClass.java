package com.intertech.qa;

public class WrapperClass {

	public static void main(String[] args) {

		String s = "7800";
		System.out.println(s + 20);

		// data conversion String to int:
		int i = Integer.parseInt(s);
		System.out.println(i + 20);

		// data conversion String to double:
		String y = "54.55";
		System.out.println(y + 3.00);

		double d = Double.parseDouble(y);
		System.out.println(d + 3.00);

		// data conversion String to boolean:
		String x = "True";
		System.out.println(x);

		boolean b = Boolean.parseBoolean(x);
		System.out.println(b);

		// data conversion int to String:
		int j = 200;
		String str = String.valueOf(j); // "200"
		System.out.println(str + 20);  //22020
		
		String l = "Hundred";
		int t = Integer.parseInt(l);
		System.out.println(t+8);
		
		// Exception -- number format exception
		// String f = "500B";
		// int k =Integer.parseInt(f);
		// System.out.println(k+10);

		String userid = "moudud@yahoo.com";
		String password = "onehundred";
		int a = Integer.parseInt(password);
		System.out.println(a + 10);

	}

}
