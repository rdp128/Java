package Matrices;

public class PrintWholeMatrixAntiDiagonal {

	public static void main(String[] args) 
	{
		int a[][] = { {10, 20, 30},
					  {50, 60, 70},
					  {90,100, 110},
					  //{190,130, 120, 600}
					  
                    };
		
		int len= a.length; //3
		
		int k=3;
		while(k < 5)// 3<4
		{
			for(int i=1 ; i<k; i++)//0..1 | i=2
			{
				
				System.out.print(a[i][len-i] + " "); break; // 21
				
			}
			System.out.println();
			k++; //3
		}
		
		
		int j=3;
		while(j>=1)
		{
			int i;
			for(i=0; i<=len-j; i++)//0..1
			{
				System.out.print(a[i][len-i-j] + " ");
				
			}
			j--;
			
			System.out.println();
		}
		
		//for(int i=1; i<len; i++)
		
		
		/*int k=2;
		
		while(k > 0)	
		{
			System.out.print(a[len-k][k] + " ");
			k--;
		}
			
		
		
			
		System.out.print(a[len-1][len-1] + " ");*/
		
	

	}

}
