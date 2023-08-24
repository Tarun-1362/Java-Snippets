package Inheritance;
class  parent
{
	public void disp()
	{
		System.out.println("this is  parent class");
	}
}
class Childdddd extends parent
{
	public void show()
	{
		System.out.println("this is child class");
		
	}
}


public class PrintMethod {

	public static void main(String[] args) {
		parent objectOfParent= new parent();
		Childdddd objectOfChild= new Childdddd();
		objectOfParent.disp();
		objectOfChild.show();
		objectOfChild.disp();
		
		//((Childdddd) objectOfParent).show();
		// The below code is used for accessing speacialized methods in the child class by the object whose 
		// reference type is parent and when the object accessed it it is downcasted to child class as seen in the 3rd lin
		parent objectOfChild_parent= new Childdddd();
		objectOfChild_parent.disp();
		((Childdddd) objectOfChild_parent).show();
	}

}
