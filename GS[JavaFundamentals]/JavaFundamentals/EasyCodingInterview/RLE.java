package EasyCodingInterview;

//RLE = RunLengthEncoding
//Ref - https://www.youtube.com/watch?v=kvB6L9hAw7k
// I/P : aaabbcRdd
// O/P : Result a3b2c1R1d2

import java.util.Scanner;

public class RLE {

	public static void main(String[] args)
	{
		System.out.println("Enter String to find RLE ");
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		
		findRLE(st);
		
		sc.close();
	}
	
	public static void findRLE(String str)
	{
		char ch[] = str.toCharArray();
		int count=1;
		char current = ch[0];
	
		StringBuilder sb = new StringBuilder(ch.length);
		
		for(int i=1;i<str.length(); i++)
		{
			if(ch[i] == current)
			{
				count++;
			}
			else 
			{
				sb.append(current +""+count);
				current=ch[i];
				count=1;
			}
		}
		sb.append(current +""+count); //Main check to add
	
		System.out.println("Result "+ sb);
		
	}

}
