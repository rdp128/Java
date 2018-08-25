package Mask;
public class MaskEmailAddress {

	public static void main(String[] args) throws Exception 
	{
		MaskEmailAddress ms = new MaskEmailAddress();
		String email = "patelrohan1993@infosys.com";
		
		//Validate email ID 
		String pattern = "[A-Za-z0-9]{1,20}@+[A-Za-z0-9]{1,20}+.[A-Za-z]{1,7}";
		if(email.matches(pattern))
		{
			int count = 0;
			for(int i=0; i<email.length(); i++)
			{
				char ch = email.charAt(i);
				
				if(ch == '@')
				{
					 count = email.substring(i).length() ;
				}	
			}	
		System.out.println(ms.maskEmail(email, 1, email.length() - count, '*'));
		}else System.out.println("Please re-enter valid email ID");
	
	}
	String maskEmail(String st, int start, int end, char maskChar) throws Exception
	{
		int maskLength = end - start;
		
		StringBuilder sb = new StringBuilder(maskLength);
		
		for(int i=0; i<maskLength ; i++)
		{
			sb.append(maskChar);
		}
		
		return st.substring(0,start) + sb.toString() + st.substring(start+maskLength);
		
	}

}
