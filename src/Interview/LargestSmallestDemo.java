package Interview;

import java.util.Arrays;

public class LargestSmallestDemo {

	public static void main(String[] args) {
		int run[] = { 0, 8, 7, 90, 77, 99, 88, 67, 87 };

		int largest = run[0];
		int smallest = run[0];

		for (int i = 1; i < run.length; i++) {
			if (run[i] > largest) {
				largest = run[i];
			} else if (run[i] < smallest) {
				smallest = run[i];
			}
		}

		System.out.println("Given run:" + Arrays.toString(run));
		System.out.println("Largest:" + largest);
		System.out.println("Smallest:" + smallest);
	}

}
