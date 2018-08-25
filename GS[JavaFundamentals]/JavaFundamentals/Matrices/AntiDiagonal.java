package Matrices;

public class AntiDiagonal 
{
	public static void main(String[] args) 
	{
		
		int a[][] = { {1, 2, 3, 4},
					  {5, 6, 7, 8},
					  {9,10, 11,12},
					  {13,14,15,16}
	                };
		
		//Bottom to TOP
		System.out.println("Bottom to Top Antidiagonal");
		int row=a.length-1, col=0;
		while( row>=0 && col<a.length)
		{
			
			System.out.print(a[row][col] + "\t");
			row--;
			col++;
		}
		
		//Using one variable
		System.out.println("\n\nUsning One Variable");
		for(int i=0; i<a.length; i++)
		{
			System.out.print( a[a.length-i-1][i]+ "\t");
		}
		
		
		//Top to Bottom (JUST CHANGE POSTION OF ROW & COL)
		System.out.println("\n\nTop to Bottom Antidiagonal");
		row=a.length-1 ; col=0;
		while( row>=0 && col<a.length)
		{
			
			System.out.print(a[col][row] + "\t");//(JUST CHANGE POSTION OF ROW & COL)
			row--;
			col++;
		}
		
		//Using one variable(JUST CHANGE POSTION OF i & length)
		System.out.println("\n\nUsning One Variable");
		for(int i=0; i<a.length; i++)
		{
			System.out.print( a[i][a.length-i-1]+ "\t");//(JUST CHANGE POSTION OF i & lrngth)
		}
		

	}
}
