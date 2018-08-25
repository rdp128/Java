package Array;

import java.util.Scanner;

public class PrintingArrayFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many element");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Your array is appear as below:");
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
		sc.close();
	}

}
