package Numbers;

public class FibionacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c;
		
		System.out.print(a + " " + b);
		
		for(int i=1 ; i<=15; i++)//first 20 number of fibionacci series
		{
			
			c=a+b;
			System.out.print(" "  + c);
			a=b;
			b=c;
		}
		

	}

}
