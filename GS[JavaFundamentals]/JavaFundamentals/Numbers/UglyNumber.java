package Numbers;

public class UglyNumber {

public static void main(String[] args) {
		
		UglyNumber ug = new UglyNumber();
		
		if(ug.ugly(300) == true)
		{
			System.out.println("yes it is ugly number");
		}
		else System.out.println("no it's not ugly number");
		
	}
	
	boolean ugly(int i)
	{
		
		boolean isUgly=true;
			while (i > 1) 
			{
				if (i % 2 == 0) {
					i /= 2;
				} else if (i % 3 == 0) {
					i /= 3;
				}
				else if (i % 5 == 0) {
					i /= 5;
				}
				else
				{
					isUgly = false;
					//System.out.println("Not ugly number");
					break;
				}
					
			}
			
			return isUgly;	
	}
}
