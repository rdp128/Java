package Array;

public class RemoveSpecificElement {

	public static void main(String[] args) 
	{
		int a[] ={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		remove(a, 2);
		
	}
	
	public static void remove(int[]a, int removeIndex)
	{
		int len = a.length;
		
		for(int i = removeIndex; i < a.length-1; i++)//i=1..9
		{
	        a[i] = a[i+1];//a[1] = 
	        
	     }
		for (int i : a)
		{
			System.out.print(i + " ");
		}
	}

}
