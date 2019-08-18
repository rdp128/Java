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
		
		//Method:2
		/*for(int i=0; i<starray.length; i++)
		{
			int j=1;
			//System.out.println(String.valueOf(st[i].charAt(0)).toUpperCase());
			//output += String.valueOf(st[i].charAt(0)).toUpperCase() + String.valueOf(st[i].substring(i+1)) ;
			System.out.print( (String.valueOf(starray[i].charAt(0)).toUpperCase()) + (String.valueOf(starray[i].substring(j)) + " "));
			j++;
		}*/
	}
}
