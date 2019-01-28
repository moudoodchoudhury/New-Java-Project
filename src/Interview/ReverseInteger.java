package Interview;

public class ReverseInteger {

	public static void main(String[] args) {

		// Two way we can do reverse integer
		// 1. Using Algorithm
		int num = 986523598;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse number is:" + rev);

		// 2. Using StringBUffer Method:
		int num1 = 935362565;
		System.out.println("Reverse Number is:" + new StringBuffer(String.valueOf(num1)).reverse());
	}
}