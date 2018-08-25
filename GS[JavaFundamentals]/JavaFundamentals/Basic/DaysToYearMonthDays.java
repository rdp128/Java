package Basic;

public class DaysToYearMonthDays {

	public static void main(String[] args) 
	
	{
	
		int days = 1000;
		
		int daysInMonth = 30;
		int monthInYear = 12;
		
		
		int month = days/daysInMonth;
		days =  days- month*daysInMonth;
		
		int year = month/monthInYear;
		month = month - year*monthInYear;
		
		System.out.println( year +" year " + month + " month " + days + " days");

	}

}
