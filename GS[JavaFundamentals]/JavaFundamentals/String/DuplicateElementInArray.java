package String;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		String str[] = { "java", "pyhton", "HTML", "java", "AngularJS", "python"};

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {

				if (str[i].equals(str[j])) {

					System.out.println("Duplicate element in  array is : "
							+ str[j]);

				}

			}

		}
		
		Set<String> no = new HashSet<String>();
		Set<String> yes = new HashSet<String>();
		
		for (String string : str) {
			if( !no.contains(string))
			{
				no.add(string);
			}
			else
			{
				no.add(string);
			}
			
		}
		System.out.println(yes);
	}

}
