package ForLoop;

/*	1	2	3	4	5
 *  2	2	3	4	5
 * 	3	3	3	4	5
 * 	4	4	4	4	5
 * 	5	5	5	5	5
 * 
 */

public class Pattern5 {

	public static void main(String[] args) {

		int rc = 5 , max = 5, k;
		for (int i = 1; i <= rc; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(i + "\t");
			}

			for (k = i + 1; k <= max; k++) {
				System.out.print(k + "\t");
			}

			System.out.println();
		}

	}

}
