package Encapsulation;

public class PracticeEncapsulation {

	private String name;
	private int a;
	private int b;
			

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}

	
				
	public static void main(String[] args) {
		PracticeEncapsulation ff = new PracticeEncapsulation();
		ff.setName("moudood");
		ff.setA(56);
		ff.setB(55);
		
		System.out.println("user name is"+ ff.getName() );
		System.out.println("his age" + ff.getA());
		System.out.println("his wife's age" + ff.getB());
		

	}

}
