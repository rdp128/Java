package Numbers;

import java.util.Scanner;

////45 = 45*45 = 2025(add it from anywhere i.e 2+025 , 202+5) = 20+25=45
//If right side has Zero not Kaprekar number
//1 is Kaprekar number

public class Kaprekar {
	
	public static void main( String[] args)
	{
		System.out.println("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(); //45
		              //1234--String index
		int sq = n*n; //2045
		
		System.out.println("Squre "+ sq);
		String s = "0" + sq;//To handel special condition 1 is Kaprekar number
		int sum=0, lp, rp,count=0;
		boolean isKaprekar=false;
		
		for(int i=1; i<s.length(); i++) //i=1 ..1<4..Y|| i=2..2<4..Y ||
		{
			lp = Integer.parseInt(s.substring(0,i)); //lp = s(0,1)=2 || s(0,2)=20
			rp = Integer.parseInt(s.substring(i)); //rp=s(1)=045 ||s(2)=45
			
			System.out.println("lp " + lp + " |rp " + rp);
			
			if(rp == 0)
			{
				break;
			}
			if(lp+rp == n)
			{
				isKaprekar = true;
				System.out.println("Pair Found:" + lp + "+" + rp + "=" + n);
				count--;
				
			}count++;
			
		}
		if(isKaprekar)
		{
			System.out.println("Yes it is Kaprekar Number");
		}
		else System.out.println("No it's not Kaaprekar Number");
		
		System.out.println("Total check " + count);
	}

}
