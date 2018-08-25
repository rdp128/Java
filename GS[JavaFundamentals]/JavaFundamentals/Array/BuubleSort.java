package Array;

import java.util.Arrays;


public class BuubleSort {

	public static void main(String[] args) {
		
		int a[] = {25,65,78,25,1,3};
		int temp = 0, maxPos= a.length-1;

		for(int j=0 ; j<a.length; j++)
		{
			for(int i=0; i<maxPos; i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			maxPos--;
		}
		System.out.println("Sorted array using bubble sort:");
		for (int print : a) {
			System.out.println(print);
		}
		System.out.println("Print array using another way:" + Arrays.toString(a));
	}

}
