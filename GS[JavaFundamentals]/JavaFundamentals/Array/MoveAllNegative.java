package Array;

import java.util.Arrays;

public class MoveAllNegative {

	public static void main(String[] args) {
		
		int a[] = {-9,50,-20,40,30,-10,20,99,-30};
		
		int a1[] = new int [a.length];//create blank array
		int j = 0 , k = a1.length-1;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != Math.abs(a[i]))
			{
				a1[j]=a[i];
				j++;
			}
			else
			{
				a1[k]=a[i];
				k--;
			}
		}
		
		for (int i : a1) {
			System.out.print(i + "\t");
		}
	}

}
