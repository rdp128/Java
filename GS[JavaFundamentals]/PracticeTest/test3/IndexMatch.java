package test3;

import java.util.Arrays;
import java.util.List;

public class IndexMatch {

	public static void main(String[] args) {
		String str = "32,4,23,5,2,45,7,43,75";
		System.out.println(str.charAt(7));
		String ch[]  = str.split(",");
		
		int[] intArray = new int[ch.length]; 
		// Creates the integer array.
		for (int i = 0; i < intArray.length; i++)
		{
		    intArray[i] = Integer.parseInt(ch[i]); 
		}
		
		//Arrays.sort(intArray);
		for (int i : intArray) {
			//if(intArray.length)
			System.out.print(i + " ");
		}
		
		
	}
}
