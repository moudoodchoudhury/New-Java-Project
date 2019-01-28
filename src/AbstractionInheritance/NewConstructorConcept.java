package AbstractionInheritance;

public class NewConstructorConcept {
	
	public NewConstructorConcept (){
		System.out.println("the same way");
		
	}
	
	public NewConstructorConcept(int i) {
		System.out.println("code:"+ i);
	}
	
	public NewConstructorConcept (byte b) {
		System.out.println("value of sigma" + b);
	}
	
	public NewConstructorConcept (String age) {
		
	System.out.println("My age is " + age);
	}
	
	
	
	

	public static void main(String[] args) {
		NewConstructorConcept hh = new NewConstructorConcept();
		NewConstructorConcept hh1 = new NewConstructorConcept(1234);
		NewConstructorConcept hh2 = new NewConstructorConcept(12);
		NewConstructorConcept hh3 = new NewConstructorConcept("35");

	}

}
