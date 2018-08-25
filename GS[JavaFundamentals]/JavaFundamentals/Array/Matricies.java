package Array;

import java.util.Iterator;

public class Matricies {

	public static void main(String[] args) 
	{
		int a[] = {2,7,4,-5,11,5,20};
		boolean sum15 = false;
		for (int i = 0; i < a.length; i++) 
		{
			for(int j= i+1; j<a.length ; j++)
			{
				if(a[i] + a[j] == 15)
				{
					System.out.println(a[i] + " + " + a[j] +" =15 ");
				}
			}
			
		}
		
	}

}
