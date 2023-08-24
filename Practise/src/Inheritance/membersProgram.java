package Inheritance;

class Members
{
	
	String Name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	Members(String Name,int age, String phoneNumber, String address, int salary)
	{
		this.Name=Name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
	public void salaryPrinter()
	{
		System.out.println("The salary is "+this.salary);
	}
	
}
class Employees extends Members
{

	Employees(String Name, int age, String phoneNumber, String address, int salary) {
		super(Name, age, phoneNumber, address, salary);
	}
	String specialization;
}
class Managers extends Members
{

	Managers(String Name, int age, String phoneNumber, String address, int salary)
	{
		super(Name, age, phoneNumber, address, salary);
		// TODO Auto-generated constructor stub
	}
	String department;
	
}



public class membersProgram {

	public static void main(String[] args) 
	{
		Employees ee= new Employees("xyz",23, "9638527412" , "kkkkkkkkkkkkkkkk", 100000);
		ee.specialization="btech";
		ee.salaryPrinter();
		Managers mm= new Managers("nnn", 60, "69696969", "hhhhhhhhhhhhh", 500000);
		mm.department="qea";
	}

}
