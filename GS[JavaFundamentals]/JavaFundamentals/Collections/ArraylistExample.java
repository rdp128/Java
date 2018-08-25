package Collections;



import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter numbers");
		
		String st = sc.nextLine();
		
		String [] str = st.split(" ");
		
		for(String value:  str)
		{
			list.add(Integer.parseInt(value));
		}
		
		int minimum = list.get(0);
		int maximum = list.get(0);
		int sum = 0;		
		for (Integer print : list) {
			sum += print;
			if(print < minimum)
			{
				minimum = print;
			}
			if(print > maximum)
			{
				maximum =  print;			}
		}
		System.out.println("Minimum: " + minimum);
		System.out.println("Maximum: " + maximum);
		System.out.println("Average is: " + (double) sum/list.size());
		
	}
		
}
