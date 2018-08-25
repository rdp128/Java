package String;

public class RemoveCharacter {

	public static void main(String[] args) {

		String str="732-762-7414";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch == '7')
			{
				String before = str.substring(0,i);
				String after = str.substring(i+1);
				str = before + "SEVEN" +after;
			}
		}
		System.out.println(str);
		
	}

}
