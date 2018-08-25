package Methods;

import Numbers.test1;

public class FindSMallestAmongThreeeNumbers {
	
	public static void main(String[] args) 
	{
		FindSMallestAmongThreeeNumbers ts = new FindSMallestAmongThreeeNumbers();
		System.out.println(ts.smallest(50, 80, 30));
	}
	
	int smallest(int x, int y, int z)
	{
		int smallest=0;
		if(x<y && x<z)
		{
			return x;
		}
		
		if(y<z)
		{
			return y;
		}
		
		else
		return z;
		
	}

}
