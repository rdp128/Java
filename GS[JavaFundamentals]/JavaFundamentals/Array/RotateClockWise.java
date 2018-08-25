package Array;

public class RotateClockWise {

	public static void main(String[] args) 
	{
		int a[] = {10, 20, 30, 40, 50, 60,99,2,1,-1};
		
		int a1[] = new int [a.length];
		
		int k = a.length - 1;
		int j= 0;
		
		for(int i=0; i<a.length-1; i++)
		{
			a1[0] = a[k];
			j++;
			a1[j] = a[i];
		}
		
		for (int i : a1) {
		
			System.out.println(i);
			
		}

	}

}
