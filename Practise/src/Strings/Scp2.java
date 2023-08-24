package Strings;

public class Scp2 {

	public static void main(String[] args) 
	{
		String str = new String("Welcome to JavaTpoint"); // statement - 1  
		String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
		System.out.println(str1 == str); // prints true  
		// TODO Auto-generated method stub
		
		String s2= str1.toLowerCase();
		System.out.println(str1==s2);
		
		
		StringBuffer sb1= new StringBuffer("11111");
		StringBuffer sb2= sb1.append(22222).reverse();
		System.out.println(sb1);
		System.out.println(sb1.equals(sb2));

	}

}
