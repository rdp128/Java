package Array;

public class LeaderElement {

	public static void main(String[] args) 
	{
		int flag = 0;
       // int a[] = {50, 9, 14, 23, 15, 0, 9};
		
        int a[] = {10, 9, 14, 23, 15, 0, 9};
        
        int lastElemet = a.length-1;
        for (int i = 0; i < a.length; i++) 
        {
           for (int j = i+1; j < a.length; j++) 
           {
              if(a[i] > a[j])
              {
                 
                 while(j < a.length-1)
                 {
                    j++;
                    if(a[i] > a[j])
                    {
                       flag = 1;
                    }
                    
                    else  break; 

                 }
              }
              else break;

           }
           if(flag == 1 ) 
           {
              System.out.println(a[i]);
              
           }
		flag=0;
		
        }
        
        for (int i = 0; i < a.length; i++)
        {
        	System.out.println(a[a.length-1]);
        	break;
			
		}
        
	}
	

}
