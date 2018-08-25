package ForLoop;

/*	1	3	5	7	9
	3	5	7	9	1
	5	7	9	1	3
	7	9	1	3	5
	9	1	3	5	7*/

public class Pattern6 {

	public static void main(String[] args) {
		
		int rc=5, max=5,firstOdd=1, num=1;
		
		for(int i=1 ; i<=rc ; i++)
		{
			num = firstOdd;
			for(int j=1 ; j<=max ; j++)
			{
				if(num >9)
				{
					num =1;
				}
				System.out.print(num + "\t");
				num +=2;//responsible for other column
				
			}
			firstOdd += 2; //resposible for first column 1 3 5 7 9 
			

			System.out.println();
		}
				
	}

}
