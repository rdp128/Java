package Methods;

import java.io.*;

public class Test1 {
	public static void main(String[] args) {
		
		int num = 32,sum=0;
		
		while(num > 0)
		{
			
			int last = num%10;
			sum += last;
			num/=10;
			
		}
		
		String st[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		/*if(Integer.toString(sum).equals(st))
		{
			System.out.println(st);
		}*/
		System.out.println(Integer.toString(sum));
	}
}
