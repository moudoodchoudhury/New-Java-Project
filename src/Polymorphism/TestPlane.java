package Polymorphism;

public class TestPlane {

	public static void main(String[] args) {
	
		
		//Static polymorphism - Compile time polymorphism
		DeltaAirline da = new DeltaAirline();
		da.Cockpit();
		da.EconomyClass();
		da.BusinesClass();
		da.FirstClass();
		
		AirbusCompany ac = new AirbusCompany();
		ac.Cockpit();
		ac.BusinesClass();
		
		//Top Casting
		//Dyamic Polymorphism - RunTime Polymorphism
		AirbusCompany obj = new DeltaAirline();
		obj.Cockpit();
		obj.BusinesClass();
	
		
		
		
		
		
		

	}

}
