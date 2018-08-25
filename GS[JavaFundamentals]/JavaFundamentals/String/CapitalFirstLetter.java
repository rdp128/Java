package String;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		
		String str= "rohan d patel";
		
		String starray[] = str.split(" ");
		
		String output="";
		
		for(int i=0; i<starray.length ; i++)
		{
			String st = starray[i];
			
			char ch = st.charAt(0);
			
			String st1 = Character.toString(ch);
			
			output = st1.toUpperCase() + st.substring(1);
			System.out.print(output + " ");	
		}
	}
}
