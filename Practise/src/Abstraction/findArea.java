package Abstraction;

import java.util.Scanner;

abstract class shape 
{
	float area;
	abstract public void input();
	abstract public void compute();
	public void disp() 
	{
		System.out.println("the area is "+ area);
	}
}
class Rectangle extends shape
{
	float length;
	float breadth;
	public void compute() 
	{
		area= length*breadth;
		
	}
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the length of rectangle: ");
		length=sc.nextFloat();
		System.out.println("Please enter the breadth of rectangle: ");
		breadth= sc.nextFloat();
	}
}	

class Square extends shape
{
	float length;
	
	public void compute() 
	{
		area= length*length;
		
	}
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the length of Square: ");
		length=sc.nextFloat();
	}
}	

class circle extends shape
{
	final float pi=3.14f;
	float radius;
	public void compute() 
	{
		area= radius * radius *2 * pi;
	}
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the radius of circle: ");
		radius=sc.nextFloat();
	}
}	
class verify
{
	public void permit(shape s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}
public class findArea {

	public static void main(String[] args)
	{
		Rectangle rc = new Rectangle();
		Square ss  = new Square();
		circle cc = new circle();
		
		verify vv= new verify();
		vv.permit(rc);
		vv.permit(ss);
		vv.permit(cc);
	}

}

