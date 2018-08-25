package Numbers;

public class PerfectNumber1To10000 {

	public static void main(String[] args) {

		
		for(int j =1 ; j<=1000; j++)
		{
			int sum = 0;
			for (int i = 1; i < j ; i++) 
			{
				if (j % i == 0) 
				{
					sum += i;
					
				}
			}
			if(sum == j)
			{
				System.out.println(sum);
			}
		}
	}
}
