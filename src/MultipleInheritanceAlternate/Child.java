package MultipleInheritanceAlternate;

public class Child implements Parent1, Parent2 {
	
	public void kindness() {
		System.out.println("This is Child Kindness");
	}
	
	public void kindness(String name) {
		System.out.println("This is Child 1 param Kindness: " + name);
	}
	
	public void kindness(String name, String name1) {
		System.out.println("This is Child 1 param Kindness: " + name);
		System.out.println("This is Child 1 param Kindness: " + name1);
	}

}
