package Interview;

import java.util.Arrays;

public class LargestandSmallestNum {
	
	
	public static void main(String[] args) {
		
	int numbers[] = {10,85,-98,125,-225,8963, 8879, -63, 78963545, 1025, -96852147};
				//  {0, 1 , 2,  3,  4,   5,     6,   7,     8,      9,       10}
	
	int largest = numbers[0];
	int smallest = numbers[0];
	
	for(int i = 1; i < numbers.length; i++) {
		if(numbers[i]>largest){
			largest = numbers[i];
		}else if(numbers[i]<smallest) {
			smallest = numbers[i]; 
		}
	}
	System.out.println(" Given Array Numbers:" + Arrays.toString(numbers));
	System.out.println("Largest:" + largest);
	System.out.println("Smallest:" + smallest);
	
	
	
	}

}
