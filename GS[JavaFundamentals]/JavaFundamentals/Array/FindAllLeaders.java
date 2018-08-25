package Array;
//Find the leaders in an array. Leaders are the element 
//who have no element larger than themselves on the right of them in the array
public class FindAllLeaders {

	public static void main(String[] args) {

		int a[] = { 8, 23, 19, 21, 15, 6, 11 };
		int k = a.length - 1;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {
				System.out.println(a[i]);

			}
		}
		System.out.println(a[k]);
	}

}
