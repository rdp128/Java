package Methods;

public class PrintCharBetweenTwoChar {

	public static void main(String[] args) 
	{
		printChars(1,10, 4);

	}
	
	public static void printChars(int ch1, int ch2, int numberPerLine)
	{
		int distance = (int) (ch2- ch1);
		
		for(int i=1 ; i<=distance+1; i++)
		{
			System.out.print((++ch1) + " ");
			
			//after 4 char it goes to next line (4/4 = 0) then it goes to next line
			if (i % numberPerLine == 0) 
			{ 
	            System.out.print("\n");
	        }
			
		}
		
	}

}
