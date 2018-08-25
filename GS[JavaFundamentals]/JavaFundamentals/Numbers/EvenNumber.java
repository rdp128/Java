package Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number : "); 
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count = 0;
		
		List<Integer> list = new ArrayList<>();
		
		for( int i=num1; i<= num2 ; i++)
		{

			if( i%2 == 0 )
			{
				list.add(i);
			}
		}
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
