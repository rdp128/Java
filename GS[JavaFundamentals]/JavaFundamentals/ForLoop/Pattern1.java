package ForLoop;

// Floyd's Triangle | Right angle Star | Right Angle even/odd no and so more
//*           
//**
//***
//****
//*****

/*	1
  	22
	333
	4444
	55555
	
	1
	12
	123
	1234
	12345
   

*/


public class Pattern1 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1 ;j<=i ;j++)
			{
			System.out.print(num);
			num++;
			}
			System.out.println();
		}
		
	}

}
