package Basic;

public class OneZeroTwoZeroTogetherInArray 
{
	public static void main(String[] args) 
	{
		int a[] = {15,10,10,100,20,20,50};
		
		boolean found1010=false, found2020=false;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] == 10 &&  a[i+1]==10 )
			{
				found1010=true;
			}
			if (a[i] == 20 &&  a[i+1]==20)
			{
				found2020=true;
			}
		}
		
		if(found1010 != found2020)
		{
			System.out.println("10 10 & 20 20 not Together");
		}
		else System.out.println("10 10 & 20 20 Together");
		
		
		
	}

}
