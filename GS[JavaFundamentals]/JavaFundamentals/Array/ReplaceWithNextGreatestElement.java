package Array;

public class ReplaceWithNextGreatestElement {

	public static void main(String[] args) 
	{
		//int a[] = {45, 20, 100, 23, -5, 2, -6};
		
		int a[] = {10,20,50,70,10,20};
		int a1[] =  new int [a.length];
		
		for (int i = 0; i < a.length; i++)   // i=0...6 | i=0
		{
			for(int j=i+1; j<a.length; j++) // j=1....6 | j=2
			{
            
				if(a[i] < a[j]) // 45 < 100
				{
					a[i] = a[j];
					
           		}	
			}
		}
         
		int j=0;
		
         for(int i=1; i<a.length-1; i++)
         {
            if(a[i]== a[i-1])
            {
               a[i]= a[i+1];
               
            }
            
         }
         
         int k = a.length-1;
         a[k] = -1;
         
         for (int i : a) {
			System.out.print(i + " ");
		}
		

	}

}
