package String;

public class IntToString {

	public static void main(String[] args) {
		
		int a1 = 10;
		int a2 = 20;
		
		String s1 = Integer.toString(a1);
		String s2 = Integer.toString(a2);
		
		String st1 = String.valueOf(a1);
		String st2 = String.valueOf(a2);
		
		System.out.println(st1+st2);
	}

}
