package Array;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {10,20,20,20,20,19};
		
		Arrays.sort(arr);
		System.out.println("Sorte array");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		
		int max1 = Integer.MIN_VALUE, max2=Integer.MIN_VALUE , max3=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if( arr[i] > max1)
			{
				//max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}
			else if( arr[i] < max2 ) 
			{
				//max2 = max1;
				max2 = arr[i];
			}
			/*else if( arr[i] < max3 ) 
			{
				
				max3 = arr[i];
			}*/
			
		}
		System.out.println();
		System.out.println("Second largest " + max2);
	}

}
