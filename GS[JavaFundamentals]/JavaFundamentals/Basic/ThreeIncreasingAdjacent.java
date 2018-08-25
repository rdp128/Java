package Basic;

import java.util.Arrays;

//Write a Java program to check if an array of integers contains three increasing adjacent numbers.

//another one is three increasing adjacent numbers by difference of 2

public class ThreeIncreasingAdjacent {

	public static void main(String[] args) 
	{
		int a[] ={11, 2, 12, 14, 13, 20};
		int count = 0;
		boolean check = false;
		for(int i=0; i<a.length-2; i++)
		{
			//if( (a[i]+1) == a[i+1])//11==12
			if( Math.abs(a[i] - a[i+2])== 1)
			{
				//check = true;
				count++;
			
			}
			/*else
			{
				check = false;
			}*/
		}
		System.out.println(count);

		if(count== 2)
		{
			System.out.println("TRUE");
		}
		else System.out.println("FALSE");
	}

}
