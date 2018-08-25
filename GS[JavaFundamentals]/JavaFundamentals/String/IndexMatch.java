package String;

public class IndexMatch {

	public static void main(String[] args) {
		
		String str ="45 54 23 13 94 22 17 18 32 1 12 32 32 ";
		
		String a[] = str.split(" ");
		int value= -1;
		for(int i=0; i<a.length ; i++)
		{
			if( Integer.parseInt(a[i]) == i+1)
			{
				value = Integer.parseInt(a[i]);
				break;
			}
		}
		System.out.println(value);
	}

}
