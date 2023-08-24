import java.util.Scanner;

public class CompareTwoStrings 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("Does first string contains letters from second string: "+ checkCompare(s1, s2));
	}
	public static boolean checkCompare(String s1,String s2) 
	{
		if(s2.length()>s1.length())
			return false;
		else if(s2.isEmpty())
			return true;
		for(int i=0;i<s2.length();i++) 
		{
			//checking for not matching the letters and returning false if not matching is not true then it exits for condition and returns true
			 if (!s1.contains(String.valueOf(s2.charAt(i))))
		         return false;
		}
		return true;
	}

}
