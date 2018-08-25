package ForLoop;

/*	1	
	3	1	
	5	3	1	
	7	5	3	1	
	9	7	5	3	1
 * 
 */

public class Test {

	public static void main(String[] args) {
		
		int rowCount=5;
		
		/*for(int row=1 ; row<=rowCount; row++)
		{
		   for(int col=1 ; col<=rowCount-row ; col++)
			{
			   System.out.print(" ");
			}
		   for(int col2=1; col2<=row ; col2++)
			{
			   System.out.print("*");
			}
		   for(int col3=1; col3<=row-1 ; col3++)
			{
			   System.out.print("*");
			}
		   
		 System.out.println();
		}
		*/
		
		for(int row=rowCount ; row>=0; row--)
		{
			for(int col=1 ; col<=rowCount-row; col++)
			{
				System.out.print(" ");
			}
			
			for(int col2=1; col2<=row; col2++)
			{
				System.out.print("*");
			}
			for(int col3=1; col3<=row-1; col3++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
