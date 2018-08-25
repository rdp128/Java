package Array;

import java.util.Arrays;

/*
 *  In the sorted array the value of the first element should be maximum, 
 *  second value should be minimum value, third should be second maximum, 
 *  fourth second be second minimum and so on
 * 
 */
public class SortInGivenPattern {

	public static void main(String[] args) 
	{
		//int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//l=10
		
		int a[] = {1,2,3,4,5,6,7,8};

		int a1[] = new int [a.length];
		
		int max = a[a.length-1];
		int min = a[0];
		
        a1[0] = max;
        a1[1] = a[0];
        
        int j=2;
		for (int i = 1; i < a.length-1; i++)
		{
         i++;
			a1[i] = a[a.length-j];
			a1[i+1]=a[j-1];
         j++;
			
		}
		
			for (int i : a1) {
				System.out.print(i + " ");
			}
		

	}

}
