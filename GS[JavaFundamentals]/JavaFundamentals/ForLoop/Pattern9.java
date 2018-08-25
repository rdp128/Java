package ForLoop;



/*   PATTERN-1
 * 
 			* 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
	   * * * * * * 
	  * * * * * * * 
 
     	    *
           ***
          *****
         *******
        *********
       ***********
      *************
*/
public class Pattern9 {

	public static void main(String[] args) {

		int rowCount = 9;

		for(int row=1 ; row<=rowCount; row++)
		{
		   for(int col=1 ; col<=rowCount-row ; col++)
			{
			   System.out.print(" "); //for Space
			}
		   for(int col2=1; col2<=row ; col2++)
			{
			   System.out.print("*");//for star
			}
		   for(int col3=1; col3<=row-1 ; col3++)
			{
			   System.out.print("*");//for star for pattern2 for pattern1 this loop is not required
			}
		   
		 System.out.println();
		}

	}

}
