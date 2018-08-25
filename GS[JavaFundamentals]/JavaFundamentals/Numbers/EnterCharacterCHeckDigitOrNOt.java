package Numbers;

import java.io.IOException;
import java.util.Scanner;

public class EnterCharacterCHeckDigitOrNOt {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ch");
		char ch = (char) System.in.read();
		
		if(ch >= 48 && ch <=57)
		{
			System.out.println("its digit");
		}
		else
		{
			System.out.println("Not didgit");
		}

	}

}
