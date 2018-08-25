package Basic;

import java.util.Scanner;

import javax.jws.Oneway;

public class NumberToWord {

	public static void main(String[] args) 
	{
		NumberToWord nw = new NumberToWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		System.out.println(converter(n));
	}
	
	public static String converter(int n)//int 502
	{
		String st="";
		while(n !=0)
		{
			if(n>=1 && n<100)
			{
				return st + oneToHundred(n); //""+oneTOHundred(99)
			}
			else if(n>=100 && n<1000)
			{
				st = st +  oneToHundred(n/100); //oneTOHundred(5)| str= 123
				st = st + "Hundred"; //str=FiveHundredTWO
				n%=100;
				 //n= 502%100 = n= 2;
			}
			else if(n>=1000 && n<10000)
			{
				st = st +  oneToHundred(n/1000); //oneTOHundred(5)| str= 5234
				st = st + "Thousand"; //str=FiveHundredTWO
				n%=1000;
				 
			}
			else if(n>=10000 && n<100000)
			{
				st = st +  oneToHundred(n/1000); //oneTOHundred(5)| str= 12345
				st = st + "Thousand"; //str=FiveHundredTWO
				n%=1000;
				
			}
			else if(n>=100000 && n<1000000)
			{
				st = st +  oneToHundred(n/100000); //oneTOHundred(5)| str= 123455
				st = st + "Hundred"; //str=FiveHundredTWO
				n%=10000;
				
			}
		}
		return st;
	}
	
	public static String oneToHundred(int num)//oneTOHundred(1233)
	{
		String str = "";
		
		while(num !=0)
		{
			if(num == 1)
			{
				str += "One";
				break;
			}
			else if(num == 2)
			{
				str += "Two";
				break;
			}
			else if(num == 3)
			{
				str += "Three";
				break;
			}
			else if(num == 4)
			{
				str += "Four";
				break;
			}
			else if(num == 5)
			{
				str += "Five";
				break;
			}
			else if(num == 6)
			{
				str += "Six";
				break;
			}
			else if(num == 7)
			{
				str += "Seven";
				break;
			}
			else if(num == 8)
			{
				str += "Eight";
				break;
			}
			else if(num == 9)
			{
				str += "Nine";//str=NinetyNine
				break;
			}
			else if(num == 10)
			{
				str += "Ten";
				break;
			}
			else if(num == 11)
			{
				str += "Eleven";
				break;
			}
			else if(num == 12)
			{
				str += "Twelve";
				break;
			}
			else if(num == 13)
			{
				str += "Thirteen";
				break;
			}
			else if(num == 14)
			{
				str += "Fourteen";
				break;
			}
			else if(num == 15)
			{
				str += "Fifteen";
				break;
			}
			else if(num == 16)
			{
				str += "Sixteen";
				break;
			}
			else if(num == 17)
			{
				str += "Seventeen";
				break;
			}
			else if(num == 18)
			{
				str += "Eighteen";
				break;
			}
			else if(num == 19)
			{
				str += "Nineteen";
				break;
			}
			else if(num>=20 && num<30)
			{
				str += "Twenty";
				num%=10;
				//break;
			}
			else if(num>=30 && num<40)
			{
				str += "Thirty";
				num%=10;
				//break;
			}
			else if(num>=40 && num<50)
			{
				str += "Fourty";
				num%=10;
				//break;
			}
			else if(num>=50 && num<60)
			{
				str += "Fifty";
				num%=10;
				//break;
			}
			else if(num>=60 && num<70)
			{
				str += "Sixty";
				num%=10;
				//break;
			}
			else if(num>=70 && num<80)
			{
				str += "Seventy";
				num%=10;
				//break;
			}
			else if(num>=70 && num<80)
			{
				str += "Eighty";
				num%=10;
				//break;
			}
			else if(num>=90 && num<100)
			{
				str += "Ninety";//str= ""+Ninety
				num%=10;//9
				//break;
			}
		}

		return str;
	}
	

}
