package Basic;

public class SecondToHourMinSec {

	public static void main(String[] args) 
	{
		
		int seconds = 86399;
		
		int secondInMinites = 60;
		int minitesInHour = 60;
		
		
		int min = seconds/secondInMinites;
		seconds =  seconds- min*secondInMinites;
		
		int hour = min/minitesInHour;
		min = min - hour*minitesInHour;
		
		System.out.println( hour +" hour " + min + " minites " + seconds + " seconds");
	}

}
