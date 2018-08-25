package Numbers;

import java.text.NumberFormat;
//ugly number whose only prime factors are 2, 3 or 5
public class test1 {
	
	public static void main(String[] args) 
	{
		test1 ts = new test1();
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

		
		
		
		
		
		
		
		
		
		
		