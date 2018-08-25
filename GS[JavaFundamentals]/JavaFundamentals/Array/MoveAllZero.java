package Array;

public class MoveAllZero {

	public static void main(String[] args) {
		
		int a[] = {0,0,1,0,3,0,5,0,6};
		
		int a1[] = new int [a.length];//create blank array
		int j=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] != 0)
			{
				a1[j]=a[i];
				j++;
			}
			
		}
		
		for (int i : a1) {
			System.out.print(i + " ");
		}
	}

}
