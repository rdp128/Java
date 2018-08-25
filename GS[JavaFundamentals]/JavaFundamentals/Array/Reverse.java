package Array;

public class Reverse {

	public static void main(String[] args) {
		
		String str[] = {"Rohan", "Kishan","DRT","Patel" };
		int count = 0;
		
		for(int i= str.length-1 ; i>=0; i--)
		{
			System.out.print(str[i] + "\t" );
			count++;
		}
		System.out.println("\nTotal element in array is:" + count);
		
	}

}
