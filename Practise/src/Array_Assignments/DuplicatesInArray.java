package Array_Assignments;

import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar= {10,20,40,60,30,40};
		
	
		for(int i=0;i < ar.length;i++ )
		{
			for(int j=i+1;j< ar.length;j++)
			{
				if(ar[j]==ar[i])
				{
					System.out.println("The duplicate in the Array is "+ar[j]);
				}
			}
		}

	}

}
