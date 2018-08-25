package Array;

public class PairOfSumIsGivenNo {
	
public static void main(String[] args) {
		
		int a[] = {4, 6, 5, -10, 8, 5, 20};

		int inputNo=15;

		for(int i=0; i<a.length; i++)//i=0...6 |i=0
		{
		   for(int j=i+1; j<a.length; j++)//j=0..6 |j=1
		   {

			if(a[i] + a[j] == inputNo)//4+4=8|4+6=10
			
			{
			   System.out.println(a[i] + "+" + a[j] + "=" + inputNo);
			}
		   }
		}

	}

}
