package Array;

public class EqualityOfTwoArray 
{
	public static void main(String[] args) 
	{
		/*int[] a1 =  {2, 5, 7, 9, 11};
		int[] a2 =  {2, 5, 7, 9, 11,15};*/
		
		String s1[] ={"ROHAN","DRT","DIPS"};
		String s2[] ={"ROHAN","DRY2","DIPS"};
		
		boolean isEqual = false;
		
		if(s1.length == s2.length)
		{
			for(int i=0; i<s1.length; i++)
			{
					if( !(s1[i].equals( s2[i])) ) //we use not equal becuase after checking first element it goes to 
						                          //i=1 is flase but isEqual is still ture
					{
						isEqual = true;
					}

			}
		}
		else { isEqual = false;}
		
		if(isEqual == true)
		{
			System.out.println("E");
		}
		else System.out.println("NE");
		
	}


}
