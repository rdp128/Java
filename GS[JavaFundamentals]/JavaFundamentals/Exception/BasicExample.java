package Exception;

//This is example of unchecked EXCEPTION

public class BasicExample {

	public static void main(String[] args) throws Exception
	{
		int a = 10;
		int b =0;

			try {
				int c = a/b;
				System.out.println(c);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getStackTrace());
			}

	}

}
