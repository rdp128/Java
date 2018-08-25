package Array;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[] = {-2,0,1,2,3,4,5};
		int sum =0;
		
		for(int i=0; i<a.length ; i++)
		{
			sum += a[i];
		}
		
		System.out.println(sum);
		
		int sum1= 0;
		for (int j = -2; j <=5; j++) {
			sum1 += j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing number is: "  + (sum1-sum));
	}

}
