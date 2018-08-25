package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) 
	{
		int a[] = {11, 15, 13, 10, 45, 20, 33, 53};
		
		int j=10;
		
		int find =0;
		while(a[find] != 10)
		{
			find++;
		}
		int a1[] = new int[(a.length-find) -1];
		int k = 0;
		for(int i=find+1; i<a.length; i++)
		{
			a1[k]=a[i];
			k++;
		}
		
		System.out.println(Arrays.toString(a1));
	}
	
}
