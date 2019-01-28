package InterfacePractice;

public interface Bigboss1 extends GodFather {
	
	default void eligibility() {
		System.out.println("Age must be 65");
	}
}

