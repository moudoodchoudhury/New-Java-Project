package MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.king();
		obj.king(65);
		obj.king("Moudud", 30);

	}

	public void king() {

		System.out.println("This is Zero Parameter King Method");
	}

	public void king(int age) {
		System.out.println("This is One Parameter King Method: " + age);
	}

	public void king(String name, int age) {
		System.out.println("This is Two Parameter King Method: " + name);
		System.out.println("This is Two Parameter King Method: " + age);
	}

}
