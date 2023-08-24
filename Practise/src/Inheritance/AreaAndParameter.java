package Inheritance;


class Rectangle
{
	int length;
	int breadth;

	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void printArea()
	{
		System.out.println("the area of the shape is "+ length*breadth);
	}
	public void printPerimeter() 
	{
		System.out.println();
		System.out.println("the perimeter of the rectangle is "+ 2 *(length + breadth));
		
	}
}
class Square extends Rectangle
{
	int s;
	public Square(int s) 
	{
		super(s,s);
	}
	
	
}


public class AreaAndParameter {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle(7,8);
		obj.printArea();
		obj.printPerimeter();
		
		
		Square sq = new Square(6);
		sq.printArea();
		
		Square[] a  = new Square[10];
		int num=7;
		for(int i=0;i<10;i++)
		{
			a[i]=new Square(num);
			num++;
		}
		
		for(int i = 0;i<10;i++)
		{
			a[i].printArea();
			a[i].printPerimeter();
		}

	}

}
