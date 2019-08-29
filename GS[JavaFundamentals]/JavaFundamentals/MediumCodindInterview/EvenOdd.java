package MediumCodindInterview;

public class EvenOdd {

	public static void main(String[] args) 
	{
		int a[]={10,2,7,8,9,4,6,15};
		
		int a1[]=new int [a.length];
		
		int j=0, k = a1.length-1;;//7
		int sum=0,count=0, sum1=0,count1=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				a1[j]=a[i];
				sum +=a1[j];
				j++;
				count++;
			}
			else
			{
				a1[k]=a[i];
				sum1 +=a1[k];
				k--;
				count1++;
				
			}
		}
		
		
		//Print new array
		for(int i:a1)
		{
			System.out.println(i);
		}
		
		System.out.println("Sum of even " + sum);
		System.out.println("Sum of odd " + sum1);
		
		System.out.println("count of even " + count);
		System.out.println("count of odd " + count1);

	}

}
