package Methods;

/*Note: a) If the length of the string is odd there will be two middle characters.
		b) If the length of the string is even there will be one middle character.

 */
public class MiddleCharacterOfString {

	public static void main(String[] args) {
		MiddleCharacterOfString mc = new MiddleCharacterOfString();
		String str= "1234";
		mc.middle(str);

	}
	
	void middle(String st)
	{
		int len = st.length();
		
		int middle = st.length()/2;
		
		if(len%2 == 0)
		{
			//return st.substring(middle-1,middle+1);
			System.out.println(st.substring(middle-1,middle+1));
		}
		else
		{
			//return st.substring(middle,middle+1);
			System.out.println(st.substring(middle,middle+1));
		}
	}

}
