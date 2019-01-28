package AbstractionInheritance;


public abstract class BangladeshBank { //1 abstract method should present
	
	//Abstract method:
	public abstract void loan();
		

	
	
	//non-abstract method:
	public void credit() {
		System.out.println("BangladeshBank - Credit");
		
	}
	
	public void debit() {
		System.out.println("BangladeshBank - Debit");
	}
	
	
	
	
	

}
