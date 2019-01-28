package AbstractionInheritance;

public class ConstructorConcept {
	// Constructor is not function
	// Constructor is a class name, it has no return types/void
	// Can we overload constructor? Yes = Multiple constructor with same name with different arguments/parameters
	
	public ConstructorConcept(){
		System.out.println("Zero parameter/Default Constrauctor");
	}
	
	
	public ConstructorConcept(int i) {
		System.out.println("One parameter:" + i);
	}
	
	
	public ConstructorConcept(String username, String Password) {
		System.out.println("UserID: " + username  );
		System.out.println("UserPassword: " + Password);
	}

	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept("mehedi", "aziz"); 
		
		
		
	}

}
