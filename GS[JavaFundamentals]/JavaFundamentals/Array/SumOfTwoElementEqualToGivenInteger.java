package Array;

//Write a Java program to find the sum of the two elements of a given array which is equal to a given integer

public class SumOfTwoElementEqualToGivenInteger 
{
	public static void main(String[] args) 
	{
		int[] a =  {1,2,4,5,6};
		
		for(int i=0; i<a.length-1 ; i++)
		{
			
				if(a[i] + a[i+1] == 6)
				System.out.println(a[i] + "," +a[i+1] );
			
		}
	}

}
