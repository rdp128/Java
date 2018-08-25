package Matrices;

public class BottomToTopDiagonal {

	public static void main(String[] args)
	{
		/*int a[][] = { 	{10, 20,  30},
				  		{50, 60,  70},
				  		{90, 100, 110},
				  		
				    };*/
		int a[][] = { {1,  2,  3,  4},
					  {5,  6,  7,  8}, //13  22 31
					  {9,  10, 11, 12},//23
					  {13, 14, 15, 16},//33
					  
					};
		//Output : 10 |50 20| 90 60 30 | 100 70 | 110
		int row=4,col=4;
		int i,j;
		for(int k=0; k<=col-1; k++)
		{
			i=0;
			j=k;
			
			while(j>=0)
			{
				System.out.print(a[i][j] + " ");
				i++;
				j--;
			}
			System.out.println();
		}
		
		for(int k=1; k<=row-1; k++)
		{
			i=k; //i=3
			j=row-1;//3
			
			while(i <= col-1)//3>=3 | 22
			{
				System.out.print(a[i][j] + " ");
				i++;
				j--;
			}
			System.out.println();
		}
	}

}
