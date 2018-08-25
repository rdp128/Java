package Array;

public class CopyToBlankArray {

	public static void main(String[] args) {
		
		int a[] = {9,5,0,4,3,0,2,1,0};
		
		int a1[] = new int [a.length];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			a1[j]=a[i];
			j++;
		}
		
		for (int i : a1) {
			System.out.println(i);
		}
	}

}
