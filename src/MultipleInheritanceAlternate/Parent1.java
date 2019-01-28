package MultipleInheritanceAlternate;

public interface Parent1 extends GrandParent {
	
	default void fun() {
		System.out.println("This is Parent 1 Fun");
	}
	
	
	

}
