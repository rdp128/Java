package ForLoop;

// DIAMOND PATTERN
public class Patter11 {

	public static void main(String[] args) {
		
		int rowCount=5;
		
		for(int row=1 ; row<=rowCount; row++)
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
