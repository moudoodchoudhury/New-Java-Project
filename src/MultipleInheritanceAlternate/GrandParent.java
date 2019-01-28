package MultipleInheritanceAlternate;

public interface GrandParent {
	
	default void honesty() {
		System.out.println("This is GrandParent Honesty");
	}

}
