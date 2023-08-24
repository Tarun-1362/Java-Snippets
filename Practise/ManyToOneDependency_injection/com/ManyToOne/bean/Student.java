package com.ManyToOne.bean;

///import com.sun.tools.sjavac.server.SysInfo;

//Target Object
public class Student 
{
	private String sid;
	private String sname;
	private String saddr;

	//Has-A variable
	Branch branch;

	public Student(String sid, String sname, String saddr, Branch branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.branch = branch;
	}
	
	public void	 Studentdetails()
	{

		System.out.println("Student details are:: ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println();
		System.out.println("Student name: "+ sname);
		System.out.println("Student Id: "+ sid);
		System.out.println("Student Address: "+ saddr);
		
		System.out.println();

		System.out.println("Branch details are:   ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println();
		System.out.println("Branch name: "+ branch.bname);
		System.out.println("Branch Id: "+ branch.bid);
		//System.out.println("Branch Address: "+ saddr);
		

		
}
}
