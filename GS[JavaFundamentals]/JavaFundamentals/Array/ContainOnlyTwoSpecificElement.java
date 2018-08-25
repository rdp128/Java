package Array;


//If array only contain 65 and 77 if not return false

public class ContainOnlyTwoSpecificElement {
	
	public static void main(String[] args) 
	{
		int[] a =  {77, 77, 77,65, 65, 65, 77};
		
		int flag=0;
			for(int i=0; i<a.length-1; i++)
			{	
				if(a[i] != 65 && a[i] != 77) // F & T =T
					{
						flag=1;
					}
				
			}
			if(flag==0)
			System.out.println("T");
			else System.out.println("F");
	}

}
