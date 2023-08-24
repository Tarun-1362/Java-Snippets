import java.util.Scanner;

public class ReverseNameWithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2="";
		
		// The String S1 which is taken is splitted based on spaces and text is an array of string containing values after splliting
		String[] text=s1.split(" ");
		
		System.out.println(" number of words in the name entered is " + text.length);
		
		//traverse over the no of words given, start from the last letter of the last word and retrieve the values from the reverse order
		for (int i = text.length-1; i >=0; i--) 
		{
			for (int j =text[i].length()-1;j>=0 ; j--) 
			{
				s2=s2+text[i].charAt(j);
			}
			s2=s2+" ";
		}
		System.out.println("reverse String is: "+ s2);
		

	}

}
