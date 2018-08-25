package String;


public class DoubleToString {

	public static void main(String[] args) {
		
		double number = 78.89;
		
		String numToString = Double.toString(number);
		
		System.out.println(numToString);
		
		int numAddZero = 100000;
		String numAsString = String.format("%,d", numAddZero);
		System.out.println(numAsString);
		

	}

}
