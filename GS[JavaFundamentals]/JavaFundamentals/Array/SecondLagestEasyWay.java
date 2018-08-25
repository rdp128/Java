package Array;

public class SecondLagestEasyWay {

	public static void main(String[] args) 
	{
		int a[] = {10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
		
		int firstHighest = Integer.MIN_VALUE; 
		int secondHighest = Integer.MIN_VALUE;
		int thirdHighest = Integer.MIN_VALUE;
		
		//for first highest
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > firstHighest)
			{
				firstHighest = a[i]; 
			}
		}
		//for second highest 
		for(int j=0; j<a.length; j++)
		{
			if(a[j] > secondHighest && firstHighest > a[j] ) 
			{
				secondHighest = a[j]; 
			}
		}
		
		//for third highest
		for(int k=0; k<a.length; k++)
		{
			if(a[k] > thirdHighest &&  secondHighest > a[k] ) 
			{
				thirdHighest = a[k];
			}
		}
		
		System.out.println("FirstHighest: "  + firstHighest);
		System.out.println("SecondHighest: " + secondHighest);
		System.out.println("ThirdHighest: "  + thirdHighest);
		

	}

}
