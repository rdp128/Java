package Numbers;

//factor of that number with out given number sum equal to number then it's perfect number

public class PerfectNumber {

	public static void main(String[] args) {
		
		int num=496,sum=0;
		
		for(int i=1 ; i<num ; i++)
		{
			if(num %i == 0)
			{
				sum += i;
				System.out.println("\t" + i);
			}
		}
		System.out.println("        ---");
		System.out.print("SUM     " + sum);
		if(sum == num)
		{
			System.out.print("....>yes");
		}
		else System.out.print("....>no");
		
	}

}
