package Array;

import java.util.HashSet;

public class CommonElement {
	
public static void main(String[] args) {
		
		/*String str1[] = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
		String str2[] = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};*/
	
		int[] str1 = {1, 2, 5, 5, 8, 9, 7, 10};
	    int[] str2 = {1, 0, 6, 15, 6, 4, 7, 0};
		

		HashSet<Integer> set = new HashSet<Integer>();

		for(int i=0; i<str1.length; i++)//i=0...6 |i=1
		{
		   for(int j=0; j<str2.length; j++)//j=0..6
		   {

			if( str1[i] ==str2[j] )//4+4=8|4+6=10
			
			{
			   set.add(str1[i]);
			}
		   }
		}
		
		System.out.println(set);
		
	}

}
