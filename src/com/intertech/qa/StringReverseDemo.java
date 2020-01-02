package com.intertech.qa;

public class StringReverseDemo {

	public static void main(String[] args) {
		String name = "kader";

		int len = name.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("--------------------------------");

		StringBuffer r = new StringBuffer(name);
		System.out.println(r.reverse());
		
		StringBuffer n= new StringBuffer(name);
		
		
		String total ="1234567";
		
		StringBuffer ob =new StringBuffer(total);
		System.out.println(ob.reverse());

	}

}
