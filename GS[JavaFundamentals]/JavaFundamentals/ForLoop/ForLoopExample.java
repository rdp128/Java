package ForLoop;

//VISIT "Vee Kay" you tube channel for perfect for loop | sorting explanation 
//Also search in you tube as ISCE keyword for more basic video 
public class ForLoopExample {

	public static void main(String[] args) {
		
		int evenNo = 400, oddNo= 399;
		
		for(int i=399; i<=1799; i++)
		{
			if(i%2 == 0)
			{
				System.out.print("-" + i);
			}
			else
			{
				System.out.print("+" + i);
			}
		}
		

	}

}
