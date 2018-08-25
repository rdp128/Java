package String;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		
		String str = "Kohli Dhoni Yuvraj ROhan";
		
		String st[] = str.split(" ");
		
		String temp = "";
		
		for(int i=0 ; i<st.length ; i++)
		{
			for(int j= i+1 ; j<st.length ; j++)
			{
				if(st[i].compareToIgnoreCase(st[j]) > 0)
				{
					temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
		
		for (String string : st) {
			System.out.print(string + " ");
		}
		
		//Method-2
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		char arr[] = data.toCharArray();
		char temp ;
		String sortedString ="";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			
			sortedString += arr[k];
		}
		System.out.println(sortedString);*/
	}

}
