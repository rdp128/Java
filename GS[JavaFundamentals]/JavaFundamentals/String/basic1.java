package String;

public class basic1 {
	
	public static void main(String[] args) {
		
		String str = "rohan Patel Rock rohan";
		String st1 = "ro";
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(st1.indexOf(ch[i]) + " ");
			
		}
		
		
		System.out.println(str.indexOf('a',str.indexOf('a')+1+str.indexOf('a') +1));
		System.out.println(str.charAt(20));
		System.out.println(str.indexOf("rohan" , str.indexOf("rohan")+1));
		System.out.println(str.charAt(17));
		
		
		//how many word starts with 'ro'
		
		String split[] = (str.toLowerCase()).split(" ");
		int count =0;
		for (String st : split) {
			if(st.startsWith("ro"))
			{
				count++;
			}
		}
		System.out.println("word starts with ro " + count);
		System.out.println("Total word is "  + split.length);
		
	}
}
