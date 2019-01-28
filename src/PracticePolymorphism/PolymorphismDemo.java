package PracticePolymorphism;

public class PolymorphismDemo {
	
	public void sum (int a, int b) {
		System.out.println("the keyword"+  a);
		System.out.println("the second keyword"+b);
	}
	
	public void sum (String username, String password) {
		
		System.out.println("the username is "+ username);
		System.out.println("the password is "+ password);
	}

	public static void main(String[] args) {
		PolymorphismDemo xx = new PolymorphismDemo();
		xx.sum(3, 5);
		xx.sum("moudood", "1234");

	}

}
