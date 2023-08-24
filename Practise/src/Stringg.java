
public class Stringg {

	public static void main(java.lang.String[] args) {
		// WAP for uppercase to lower and lower to uppercase
		// TODO Auto-generated method stub
		String s1= "TARUN";
		String s2 = "";
		//System.out.println(s2);
		//System.out.println(s1.equals(s2));
		//System.out.println(s1==s2);
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
			System.out.println(s2);
		
		
		String s3="";
		for(int i=0; i<s1.length();i++) 
		{
			if((s1.charAt(i)<(char)97 && s1.charAt(i) > (char)64))
			{
				 s3= s1;
			}
			else 
			{
				 s3= s3+(char)(s1.charAt(i)-32);
				
			}
			
			
		}
		System.out.println(s3);
	}

}