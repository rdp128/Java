package Numbers;

public class ArmStrongNumber1To1000 {
	
	public static void main(String[] args) {
		
		int num=0,sum=0;
		System.out.print(1 + " ");
		for(int i=1; i<=1000000; i++)
		{
			num = i;
			int len = Integer.toString(num).length();
			
			while(num > 0)
			{
				int lastDigit = num%10; //2
				sum += Math.pow(lastDigit, len);//
				num /= 10;	
			}
			
			if(sum == i && i>10)
			{
				
				System.out.print(i + " ");
			}
			sum = 0;
		}
		
	}

}
