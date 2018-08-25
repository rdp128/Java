package String;

public class PrintEveryOtherCharacterOfReverseString {

	public static void main(String[] args) {
		
		String str = "Rohan";
		
		String reverseString= "";
		
		String everyOtherCharacter = "";
		
		for(int i=str.length()-1 ; i>=0; i--)
		{
			reverseString  += str.charAt(i);
		}
		
		for(int j=0; j< reverseString.length(); j+= 2)
		{
			everyOtherCharacter += reverseString.charAt(j);
			
		}
		System.out.println(everyOtherCharacter);
	}

}
