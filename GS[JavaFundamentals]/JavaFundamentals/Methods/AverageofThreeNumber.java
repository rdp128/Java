package Methods;

public class AverageofThreeNumber {

	public static void main(String[] args) {
		AverageofThreeNumber ag = new AverageofThreeNumber();
		System.out.println(ag.avg(10, 20, 30));
	}
	
	double avg(int x, int y, int z)
	{
		double avg= x+y+z/3;
		return avg;
	}

}
