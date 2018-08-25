package Array;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr[] = {25,65,78,1,3};
		
		Arrays.sort(arr);
		System.out.println("Using built in Sorted Method");
		for (int i : arr) {
			System.out.println(i);
		}
		
		int temp =0 ,sum=0 ,count=0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		System.out.println("Sorted array using selection sort is");
		for (int i : arr) {
			System.out.print(i + "\t");
			sum += i;
		}
		System.out.println("\nSum is: " + sum);
		
		System.out.println("\nReverse of sorted array is");
		
		for(int j=arr.length-1 ; j>=0; j--)
		{
			System.out.print(arr[j] + "\t" );
			count++;
		}
		System.out.println("\ntotal element is array is :" + count);
	}

}
