package Array;

public class SmallestLargest {

	public static void main(String[] args) {
		
		int a[] = {0,5,44,56,99,999,785,4,5 };
		
		int largest = Integer.MAX_VALUE;
		int smallest = Integer.MIN_VALUE;
		
		for (int j = 0; j < a.length; j++) {
			
			System.out.print(a[j] + "\t");
			if( a[j] > largest)
			{
				largest = a[j];
				
			}
			
		}
		
		System.out.println(largest);

	}

}
