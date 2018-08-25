package String;

import java.util.*;

class Anagaram {
	public static void main(String args[]) {
		System.out.println("enter two strings");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		boolean isAnagram = false;

		if (str1.length() != str2.length()) {
			isAnagram = false;
		}

		else {
			char str1array[] = str1.toLowerCase().toCharArray();
			char str2array[] = str2.toLowerCase().toCharArray();

			Arrays.sort(str1array);
			Arrays.sort(str2array);

			if (Arrays.equals(str1array, str2array))
				isAnagram = true;
		}

		if (isAnagram) {
			System.out.println("Given Strings are Anagrams");
		}

		else {
			System.out.println("Given Strings are not Anagrams");
		}

	}
}
