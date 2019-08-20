package EasyCodingInterview;

public class MissingLetter {

	public static void main(String[] args) 
	{
		char c[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		String str = "The quick brown fox jump over the lazy dog";
		String missing="";
		int count =0;
		
		for(int i=0; i<c.length;i++)
		{
			if( !str.contains(String.valueOf(c[i])))		
			{
				missing += String.valueOf(c[i]);
				count++;
			}
		}
		System.out.println("Missing letter:"+missing  + " | Count:"+ count);

	}

}
