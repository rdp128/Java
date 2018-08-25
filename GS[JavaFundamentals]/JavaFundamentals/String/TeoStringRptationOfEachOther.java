package String;

public class TeoStringRptationOfEachOther {

public static void main(String[] args) {
		
		String st1 = "JavaJ2eeStrutsHibernate";
		String st2 = "StrutsHibernateJavaJ2ee";
		
		if(st1.length() == st2.length())
		{
			String st3 = st1+st1;
			if(st3.contains(st2))
			{
				System.out.println("yes");
			}
			else
				System.out.println("no");
		}
		else
		{
			System.out.println("no");
		}
		
		
	}

}
