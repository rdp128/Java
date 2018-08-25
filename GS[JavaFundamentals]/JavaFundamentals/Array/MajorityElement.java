package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) 
	{
	
		int a[] = {1, 6, 6, 5, 7, 1, 7, 7, 7, 7, 7, 7, 7,7,7,7,7,7,7,7};
		
		int count=0, count1=0,copy=0,i=0,j=0;
		
		
		for( i=0; i<a.length-1; i++)
		{
			
			if(a[i] == a[i+1])
			{
				count++;
				copy = i; //copy index of that 1st majority element
				break;
	
			}
			if(count > count1)
			{
				System.out.println("Majority Element :" +a[i]);
				break;
			}
		}
		
		//start this loop from that 1st majority element | count how many time element equal then compare both count
		for(j = copy; j<a.length-1 ;j++)
		{
			if(a[j] == a[j-1])
			{
				count1++;
			}
			
			if(count < count1)
			{
				System.out.println("Majority Element :" +a[j]);
				break;
			}
		}

	}

}
