package Basic;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args)
	{
		int a=10, num=0;
		
		for(int i=1; i<=a ;i++)
		{
			for(int j=1 ; j<=i; j++)
			{
				if(i%2 != 0)
				{
					System.out.print(num);
				}
				
				else
				{
					num=1;
					System.out.print("0" + num);
				}
				
			}
			
			System.out.println();
		}
		
		
	}

}
