package Matrices;

public class Revese 
{
	public static void main(String[] args)
	{
		int a[][] = { {1,2,3},
					  {4,5,6},
					  {7,8,9},
					  {10,11,12}
					  
		            };
		
		for(int i=0; i<a.length; i++) //i=0...3 | i=0 | i=1
		{
			
			for(int j=a[i].length-1; j>=0; j--) //j=0...3 |j=0 |2<3
			{
				System.out.print(a[i][j] + "\t"); //00 ,01,02 | 12 , 11, 10
			}
			System.out.println();
		}
			
			
		}

}
