package Interview;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Moudud"; // duduoM

		// 2 way do reverse String:

		// 1. using for loop:
		int len = name.length(); // 6-1
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

		System.out.println("************************************");

		// 2. using StringBuffer class:
		StringBuffer r = new StringBuffer(name);
		System.out.println(r.reverse());

	}

}
