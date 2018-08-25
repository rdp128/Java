package Array;

public class PrintLongestName {

	public static void main(String[] args) {
		
		String str[] = {"Rohan","Kishan","DRT","LOVE NI BHAVAY"};
		String store = "", name ="";
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < str.length; i++) 
		{
			store = str[i];
			if(store.length() > max)
			{
				max=store.length();
				name= store;
			}
		}
		System.out.println("Longest name : " + name  + " |Its length is --->" + max);
	}

}
