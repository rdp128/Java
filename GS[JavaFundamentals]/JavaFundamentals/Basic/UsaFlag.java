package Basic;

public class UsaFlag {

	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1 ; j<=20; j++)
			{
				if(i <=5 && j<=10)
				{
					System.out.print("*" + " ");
				}
				else
				System.out.print("=" + " ");
				
			}
			System.out.println();
		}
	}

}
