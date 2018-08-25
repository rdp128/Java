package String;
import java.util.Scanner;

public class NoOfEachLetterOccurrences {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine().toUpperCase();
		sc.close();
		int count =0;
		
		for(char j='A'; j<='Z' ; j++)
		{
			for(int i=0; i<str.length() ; i++)
			{
				if(str.charAt(i) == j)
				{
					count++;
				}
			}
				if(count > 0)//change 0 to 1 to find out number is repeating more than one
				System.out.print(j+":"  +count + "\t");
				count=0;
		}
		/*int a[] = new int[26];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String data = sc. nextLine();
		
		System.out.println("No of times each letter occurrences");
		for(int i=0 ; i<data.length() ; i++)
		{
			//for capital letter
			if(data.charAt(i) >= 65 && data.charAt(i) <=90)
			{
				a[data.charAt(i) - 65]++; //increment by one in new array
			}
			//for small letter
			else if(data.charAt(i) >= 97 && data.charAt(i) <=122)
			{
				a[data.charAt(i) - 97]++;
			}
		}
		//fetching value from array a
		for(int i =0; i<a.length ; i++)
		{
			if(a[i] > 1)
			{
			System.out.print( (char)(i+65) + "-" + a[i] + "|");
			}
		}*/
		
	}

}
