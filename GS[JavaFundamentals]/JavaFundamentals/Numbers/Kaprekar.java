package Numbers;

public class Kaprekar {
	
	public static void main( String[] args)
	{
		
		for(int i=4; i<=10000; i++)
		{
			int sqaure = (int)Math.pow(i, 2);
			
			int len = Integer.toString(sqaure).length()/2;
			
			String strSq = Integer.toString(sqaure);
			
			String p1 = strSq.substring(0, len);
			int part1 = Integer.parseInt(p1);
			
			String p2 = strSq.substring(len);
			int part2 = Integer.parseInt(p2);
			
			
			
			int add = part1 + part2;
			
			if(add == i)
			{
				System.out.println(i +"\t" + sqaure + "\t" + part1+" + " + String.format("%02d", part2));
			}
			
			
		}
		
	}

}
