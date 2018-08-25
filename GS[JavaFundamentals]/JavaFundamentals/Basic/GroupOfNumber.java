package Basic;


//compare first 2 and last 2 element in array
public class GroupOfNumber {

	public static void main(String[] args) 
	{
		int a[] = {11, 15, 13, 10, 45, 20, 11, 15};//L=8 | index = 7
		
		int result = 0;
		
	    int start = 0;
		int end = a.length-2;
		for(int l = 0; l <2; l++)
		{
			if(a[start] == a[end] && end<=a.length)
			{
				result++;
	            start++;
	            end++;
            
			}
			
		}
		      
		//System.out.println(result);
	    if (result==2)
		 {
		  System.out.printf(String.valueOf(true));
		 }
		else
		 {
		   System.out.printf(String.valueOf(false));
		 }
		 System.out.printf("\n");
		
	}

}
