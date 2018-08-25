package Numbers;

public class UglyNumberMethod1 {
	
public static void main(String[] args) {
		
		int num = 8;
		boolean isUgly=true;
			while (num > 1) 
			{
				if (num % 2 == 0) {
					num /= 2;
				} else if (num % 3 == 0) {
					num /= 3;
				}
				else if (num % 5 == 0) {
					num /= 5;
				}
				else
				{
					isUgly = false;
					System.out.println("Not ugly number");
					break;
				}
					
			}
			if(isUgly)
			{
				System.out.println("Yes it is ugly number");
			}
		
	}


}
