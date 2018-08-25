package Array;

//SORTING STRING ARRAY USING SELECTION SORT 

import java.util.Scanner;

public class SortStringArray {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a[] = new String[4];
		System.out.println("Enter 4 name");
		
		String temp = "";
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextLine();
		}
		
		for(int j=0 ; j<a.length ; j++)
		{
			for(int k= j+1 ; k<a.length ; k++)
			{
				if(a[j].compareToIgnoreCase(a[k]) > 0) //MAKE GREATER THAN TO LESS THAN FOR DESCENDING ORDER 
				{
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
					
				}
			}
		}
		
		for (String string : a) {
			System.out.println(string);
		}
		sc.close();
	}

}
