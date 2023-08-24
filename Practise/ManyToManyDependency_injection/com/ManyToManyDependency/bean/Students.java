package com.ManyToManyDependency.bean;


//Target object
public class Students
{
	private String sid;
	private String sname;
	private String saddr;
	
	//Has-a variable

	
	private Courses[] course;

	public Students(String sid, String sname, String saddr, Courses[] course) 
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}

	
	public void getStudentDetails()
	{
		

		System.out.println("Student details are:: ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println();
		
		System.out.println("The student id is: "+ sid);
		System.out.println("The student name is: "+ sname);
		System.out.println("the Stdent address is: "+ saddr);
		System.out.println();
		
		System.out.println("The course details are: ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println();
		for (Courses courses : course) 
		{
			System.out.println("The course id is: "+ courses.cid);
			System.out.println("The course name is: "+ courses.cnmae);
			System.out.println("The course cost is: "+ courses.ccost);
			System.out.println("==========================================");
			System.out.println()
			;System.out.println();
			System.out.println();
			
		}
		
		
		
		
	}
}
