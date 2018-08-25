package Array;

public class InsertValueAtSpecificIndex {

	public static void main(String[] args) 
		{
			int a[] ={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
			insert(a, 10,2);
			
		}
		
		public static void insert(int[]a, int value,int insertIndex)
		{
			int len = a.length;
			
			
			for(int i = a.length-1; i > insertIndex ; i--)
			{
				a[i]  =a[i-1];
		        
		    }
			a[insertIndex] = value;

			for (int i : a)
			{
				System.out.print(i + " ");
			}
		}

	

}
