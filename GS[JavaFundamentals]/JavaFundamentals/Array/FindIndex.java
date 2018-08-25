package Array;

public class FindIndex {

	public static void main(String[] args) 
	{
		int a[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println(findIndex(a, 29));

	}
	
	public static int findIndex(int[] a , int element)
	{
		int x =0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == element)
			{
				return x += i;
			}
		}
		return x;
	}

}
