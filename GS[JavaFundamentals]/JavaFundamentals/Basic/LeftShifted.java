package Basic;

import java.util.Arrays;

public class LeftShifted {

	public static void main(String[] args) 
	{
		int a[] = {11, 15, 13, 10, 45, 20};
		
		int a1[] = new int[a.length];
		
		for(int i=0; i<a.length-1; i++)
		{
			a1[i]=a[i+1];
			a1[a.length-1]=a[0];
		}
		
		System.out.println(Arrays.toString(a1));
	}

}
