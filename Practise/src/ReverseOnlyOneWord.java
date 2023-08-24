import java.util.Scanner;

public class ReverseOnlyOneWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String first=sc.nextLine();
		String sec="";
		String[] arr=first.split(" ");
		
		for (int i = arr.length-1; i >0; i--) 
		{
			for (int j = arr[i].length()-1; j >=0; j--) 
			{
				sec=sec+arr[i].charAt(j);
				
			}
			sec=sec+" ";
			
			
		}
		sec=arr[0]+" "+sec;
		System.out.println("First String: "+ first);
		System.out.println("Second String: " + sec);

	}

}
