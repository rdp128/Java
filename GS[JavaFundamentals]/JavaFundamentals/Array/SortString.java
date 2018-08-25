package Array;

public class SortString {
	
public static void main(String[] args) {
	
	String str = "Rohan";
	
	String st[] = str.split("");
	
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
		System.out.print(string);
	}
 }

}
