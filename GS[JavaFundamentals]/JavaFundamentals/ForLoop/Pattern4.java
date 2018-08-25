package ForLoop;

/*   	 	 	 	1	
 	 	 		2	3	
 	 		4	5	6	
 		7	8	9	10	
	11	12	13	14	15	
  
 */
public class Pattern4 {

	public static void main(String[] args) {
		int num=1,rc= 5,max=rc-1;
		for(int i=1; i<=rc; i++)
		{
			
			for(int j=1 ;j<=max ;j++)
			{
			System.out.print(" "+ "\t");
			
			}
			max--;
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
		
	}

}
