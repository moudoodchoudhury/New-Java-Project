package com.intertech.qa;

public class StaticandNonStaticConcept {
	
	static String name = "Reza";  //Static Class/global variables
	int age = 25; //non-static global variables/class variables
	
	public static void main(String[] args) {

		// static method calling:2 way
		// 1. Direct calling:
		//moudud();
		//raj();
		//System.out.println(name);
		

		// 2. By class name calling:
		StaticandNonStaticConcept.raj();
		System.out.println(StaticandNonStaticConcept.name);
		

		
		// Non-static method calling:1 way
			//1. By class object calling
		StaticandNonStaticConcept obj = new StaticandNonStaticConcept();
		obj.mehedi();
		obj.mubarak();
		System.out.println(obj.age);


		
		
	}

	public static void moudud() {
		System.out.println("Static Method - Moudud");

	}
	
	public static void raj() {
		System.out.println("Static Method - Raj");
	}

	public void mehedi() {
		System.out.println("Non-Static Method - Mehedi");

	}
	
	public void mubarak() {
		System.out.println("Non-Static Method - Mubarak");
		
	}

}