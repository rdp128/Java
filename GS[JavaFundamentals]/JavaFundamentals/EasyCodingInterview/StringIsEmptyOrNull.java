package EasyCodingInterview;

public class StringIsEmptyOrNull {

	public static void main(String[] args)
	{
		String str = " ";
		
		if( str != null && str.length() >0)
		{
			System.out.println("String is not null and not empty");
		}
		else{
			System.out.println("String is empty");
		}

	}

}
