package PracriceStringmanupulation;

public class StringManupulationPractice {

	public static void main(String[] args) {
		String a = "he is my friend";
		String b = "   nice, place   ";

		System.out.println(a.length());
		System.out.println(a.charAt(9));
		System.out.println(a.indexOf('m'));
		System.out.println(a.indexOf("my"));
		System.out.println(a.substring(9));
		System.out.println(a.substring(3, 15));
		System.out.println(b.trim());
		System.out.println(b.replace('n', 'm'));
		System.out.println(b.replace(",", "."));
		System.out.println(b.replace("  ", ""));

	}

}
