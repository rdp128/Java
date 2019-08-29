package MediumCodindInterview;

import java.util.ArrayList;

// Given two sorted array of integers sort them in to ascending order without using any separate array
//I/P = {0,2,5,8} {1,6,7}; O/P={0,1,2,5} {6,7,8}
public class TwoSortedArray {

	public static void main(String[] args) {
		int a1[]={0,2,5,8};
		int a2[]={1,6,7};
		
		ArrayList<Integer> list = new ArrayList<Integer>(4);
		int temp;
		for(int i=0;i<a1.length-1;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]>a2[i])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
					
				}
			}
		}
		
		System.out.println(list);
		
		for(int i:a2)
		{
			System.out.println(i);
		}

	}

}
