package ForLoop;

/*  UPSIDE DOWN PYRAMID 
 
*************
 ***********
  *********
   *******
    *****
     ***
      *
       
*/

public class Pattern10 {

	public static void main(String[] args) {
		
		int rowCount=7;
		
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
