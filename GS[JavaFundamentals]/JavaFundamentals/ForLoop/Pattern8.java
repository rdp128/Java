package ForLoop;

/*	1	
3	1	
5	3	1	
7	5	3	1	
9	7	5	3	1
* 
*/
public class Pattern8 {
	public static void main(String[] args) {
		
		int rowCount=5,num=1,firstOdd=1;
		
		for(int row=1; row<=rowCount ; row++)
		{
			num = firstOdd;
			for(int col=1; col<=row; col++)
			{
				if(num > firstOdd)
				{
					num =1;
				}
				
				System.out.print(num + "\t");
				
				num -=2;//Responsible for second,third,forth and fifth column 
			}
			
			firstOdd +=2 ;//Responsible for first column 1 3 5 7 9
			System.out.println();
		}
	}

}



