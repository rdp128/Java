package String;

public class Replace {

	public static void main(String[] args) {
		
		String str = "    Region     regi on";
		 
     
 
        char[] strArray = str.toCharArray();
 
        StringBuffer sb = new StringBuffer();
 
        for (int i = 0; i < strArray.length; i++)
        {
            if( (strArray[i] != 'R' && strArray[i] != ' ')  )
            {
                sb.append(strArray[i]);
            }
        }
        System.out.println(sb);
		
	}

}
