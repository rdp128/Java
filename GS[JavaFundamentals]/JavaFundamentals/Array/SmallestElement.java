package Array;

public class SmallestElement {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 100, 0, -1 };
		int minimum = minumum(null);
		int maximun = maximum(arr);
		int sum = sum(arr);
		double avg = avg(arr);

		System.out.println("Minimum:" + minimum);
		System.out.println("Maximum:" + maximun);
		System.out.println("SUM: " + sum);
		System.out.println("Average: " + avg);
	}

	private static double avg(int[] arr) {
		int avg = 0;
		int sum = 0;
		for (int i : arr) {
			sum += i;
			avg = sum/arr.length;
		}
		
		return avg;
	}

	private static int sum(int[] arr) {
		
		int sum =0;
		
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	private static int maximum(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	private static int minumum(int[] arr) {
		int min = -1;
		if (arr != null) {
			min = arr[0];
			for (int i = 1; i < arr.length; i++) {

				if (arr[i] < min) {
					min = arr[i];
				}
			}
		}
		return min;
	}

}
