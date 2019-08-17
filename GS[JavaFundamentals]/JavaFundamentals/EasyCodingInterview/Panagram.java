package EasyCodingInterview;

import java.util.Scanner;

//Check if string contains all alphabet letter

/*We promptly judged antique ivory buckles for the next prize.
How razorback jumping frogs can level six piqued gymnasts.
Sixty zippers were quickly picked from the woven jute bag.
Crazy Fredrick bought many very exquisite opal jewels.
Jump by vow of quick, lazy strength in Oxford.
The quick brown fox jumps over the lazy dog.*/

/* Logic:
 * 
 * String st = "Roahn";
 * convert to uppercase or lower case
 * check index of st with character A to Z letter (Using for loop)
 * if st letter is not contains all chat...-1
 * if st letter is contains all char it return 1 index even if it is repeat
 */
public class Panagram {

	public static void main(String[] args) 
	{
		System.out.println("Enter sentence to che it is panagram or not ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine().toUpperCase();
		sc.close();
		if(isPanagram(st)){
			System.out.println("Yes it is panagram");
		}
		else
		{
			System.out.println("It's not Panagram");
		}

	}
	
	static boolean isPanagram(String str)
	{
		//boolean checkPanagram = false;
		int count =0;
		
		for(char c='A'; c<='Z'; c++)
		{
			if(str.indexOf(c) >= 0)
			{
				count++;
			}
		}
		
		if(count == 26)
		{
			return true;
		}
		else
			return false;
		
	}

}
