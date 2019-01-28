package com.intertech.qa;

public class ThisKeyword {
	
	String name1;  //Global variables/class variables
	int age;
	
	public ThisKeyword(String name, int age) {
	name1 = name;  //global to local conversion, without this keyword
	this.age = age;
	
	System.out.println(name);
	System.out.println(age);
			
	}
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword("Md. Ashraful", 25);
		
		
	}

}
