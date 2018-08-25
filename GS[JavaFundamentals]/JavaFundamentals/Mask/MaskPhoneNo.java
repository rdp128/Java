package Mask;

public class MaskPhoneNo {

	public static void main(String[] args) throws Exception
	{
		MaskPhoneNo ms = new MaskPhoneNo();
		String phoneNo= "732-762-7414";
		
		//print first an last 3 char
		System.out.println(ms.maskString(phoneNo, 1, 9 , 'x'));
		
		//print last 3 char only
		System.out.println(ms.maskString(phoneNo, 0, phoneNo.length()-3 , 'x'));
		
		//everthing blur out
		System.out.println(ms.maskString(phoneNo, 0, phoneNo.length() , 'x'));
	}
	
    public String maskString(String st, int start, int end, char maskChar) throws Exception
    {
    	//Handel exceptions
    	
    	if(start < 0)
    	{
    		start = 0;
    	}
    	
    	if(end > st.length())
    	{
    		end = st.length();
    	}
    	
    	if(start > end)
    	{
    		throw new Exception("Start index must be smaller than last index");
    	}
    	
    	
    	
		int maskLength = end - start ; // How many times maskChar to  be printed
    	StringBuilder sb = new StringBuilder(maskLength);
    	
    	for(int i=0; i<maskLength ; i++)
    	{
    		sb.append(maskChar);
    	}
    	
    	return st.substring(0,start) + sb.toString() + st.substring(start + maskLength);
    	 
    	
    }

}
