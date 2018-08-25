package Matrices;

public class Diagonal 
{
	public static void main(String[] args)
	{
		int a[][] = { {1, 2, 3},
					  {4, 5, 6},
					  {7, 8, 9},
					  {10,11,12}
					  
		            };
		
		int sum=0;
		
		//Method-1
		System.out.println("Method-1");
		for(int i=0; i<a.length; i++) 
		{
			for(int j=0; j<a[i].length; j++) 
			{
				if(i == j)
				{
					System.out.print("\t" + a[i][j]); 
					sum = sum + a[i][j];
				}
			}					
		
			System.out.println();

		}//end of outer for loop
			
		System.out.println("Total :" + sum);	
		
		//Method-2
		sum=0;
		System.out.println("\nMethod-2");
		for(int i=0; i<a.length-1; i++)
		{
			System.out.println(a[i][i]);
			sum += a[i][i];
		}
		System.out.println("Sum Using Mehod2 : " + sum);
	}

}
