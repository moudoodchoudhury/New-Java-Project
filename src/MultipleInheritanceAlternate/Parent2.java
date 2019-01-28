package MultipleInheritanceAlternate;

public interface Parent2 extends GrandParent {
	
	default void laugh() {
		System.out.println("This is Parent 2 Laugh");
	}
	
}
