package Methods;

public class CountAllWord {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println("TOTAL WORD IS "  + count(str));
	}
	
	public static int count(String st)
	{
		int count =0;
		String st1[] = st.split(" ");
		
		for (String string : st1) {
			count++;
		}
		return count;
	}

}
