package Numbers;

public class CubeRootNumber {
	
	public static void main(String[] args) 
	{
		for(int i=1; i<=1000; i++)
		{
		
			double ans = Math.cbrt(i);
			
			if(Math.ceil(ans) == ans)
			{
			System.out.print(i + " ");
			} //else System.out.println("no");
		}
		
	}

}
