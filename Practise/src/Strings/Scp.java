package Strings;

public class Scp {

	public static void main(String[] args)
	{
		String s1= new String("tarun");
		String s2=new String("tarun");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.intern()==s1.intern());
		// TODO Auto-generated method stub

	}

}
