package Array;

public class FindDuplicate {

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 5, 5, 6, 6, 7, 2};
		
		//String a[] = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		int count =0;
		for(int i=0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Dups Element is " + a[i] + " --->at index " + i +" and "  + j);
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
