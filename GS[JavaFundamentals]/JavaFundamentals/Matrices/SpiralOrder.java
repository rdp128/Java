package Matrices;

public class SpiralOrder 
{
	public static void main(String[] args)
	{
		int a[][] = { {1, 2, 3},
					  {4, 5, 6},
					  {7, 8, 9},
					  {10,11,12}
					  
		            };
		
		int sum=0;
		for(int i=a.length-1; i>=0; i--) 
		{
			
				for(int j=a[i].length-1; j>=0; j--) 
				{
					if(i == j)
					{
						System.out.print(a[i][j] + "\t"); 
						sum = sum + a[i][j];
					}
				}					
			
			System.out.println();

		}//end of outer for loop
			
		System.out.println("Total :" + sum);	
	}
}
