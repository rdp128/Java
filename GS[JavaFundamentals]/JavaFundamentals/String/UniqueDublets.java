package String;

import java.util.Scanner;

public class UniqueDublets {

	public static boolean dublets(String st1, String st2) {
		int count = 0;
		char[] char1 = st1.toCharArray();
		char[] char2 = st2.toCharArray();

		for (int i = 0; i < char1.length; i++) {
			if (char1[i] != char2[i]) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = sc.nextLine();
		String str[] = str1.split(" ");
		int ndublets = 0;
		
		for (int i = 0; i <= str.length - 1; i++) {
			for (int j = i + 1; j <= str.length - 1; j++) {
				if (dublets(str[i], str[j])) {
					System.out.println(str[i] + ":" + str[j]);
					ndublets++;
				}
				
			}
		}
		if(ndublets == 0)
		{
			System.out.println("-1");
		}

	}

}
