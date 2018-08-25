package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int array[] = {10,20,30,40,50};
		
		int copy[] = Arrays.copyOf(array, array.length);
		
		copy[0] = 99;
		System.out.println("Original: " + array[0]);
		System.out.println("Copy: " +copy[0]);
		
		
	}

}
