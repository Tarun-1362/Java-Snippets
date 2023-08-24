package Inheritance;

class Parent11
{
	private String name;
	
	Parent11()
	{
		System.out.println("Parent Constructor");
	}
	void disp()
	{
		System.out.println("disp in Parent ");
	}
}

class Child11 extends Parent11
{
	//Child11()
	//{
		//super();
	//}
	void disp()
	{
		//name="Hyder"; private memebrs will not participate in inheirtamce
		System.out.println("disp in child");
	}
}
public class LaunchCyclic
{

	public static void main(String[] args) 
	{
		Child11 c=new Child11();
		c.disp();
	}

}
