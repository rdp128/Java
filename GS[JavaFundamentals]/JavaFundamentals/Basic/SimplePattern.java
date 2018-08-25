package Basic;


//print n+nn+nnn+nnnn Pattern 

public class SimplePattern {

	public static void main(String[] args) 
	{
		String num = "5", num2="5";
		int n=1;
		
		for(int i=1 ; i<=5; i++)
		{
			System.out.print(Integer.parseInt(num2) );
			num2 += "5" ;
			
			if(i <5)
			{
			System.out.print("+");
			}
		}
		
	}

}