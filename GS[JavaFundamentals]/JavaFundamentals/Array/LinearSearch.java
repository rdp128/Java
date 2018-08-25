package Array;

public class LinearSearch {

	public static void main(String[] args) {

		
		int arr[] = {1,2,3,4,1000,-1};
		
		int find =-1 , flag = 0,i ;
		int smallest = arr[0],largest=arr[0];
		
		for (i = 0; i < arr.length; i++) {
			
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
			
			if(arr[i]>largest)			{
				largest = arr[i];
			}
			
			if(arr[i] == find )
			{
				flag =1;
				break;
			}
			
		}
		if( flag == 1 )
		{
			System.out.println( arr[i] + " element is in array at index " + (i) + " position");
		}
		else
		{
			System.out.println(find + " Element is Not found in aaray ");
		}
		System.out.println("Smallest value is " +smallest);
		System.out.println("Largest value is "+ largest);
		}
	
}
