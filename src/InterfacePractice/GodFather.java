package InterfacePractice;

public interface GodFather {

	default void age() {
		System.out.println("age must be 60");
	}
}

