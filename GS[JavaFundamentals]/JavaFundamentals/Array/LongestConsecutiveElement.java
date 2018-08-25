package Array;

import java.util.Arrays;

/*
 * Find the length of the longest consecutive elements sequence 
 * from a given unsorted array of integers
 * 
 */
public class LongestConsecutiveElement {

	public static void main(String[] args) 
	{
		int a[] = {49, 1, 3, 200, 2, 4, 70, 5,6,7,8,9,10};
		
		Arrays.sort(a);
		int count=0;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i+1] - a[i] == 1)
			{
				count++;
			}
				
		}
		
		System.out.println(count + 1);

	}

}
