package com.prac.bean;

public class Department 
{
	private String depName;
	private String depId;
	
	//since there are many staff existe fpr a single department (one to many) the staff are taken in form as array
	private Staff[] st;

	
	//constructor injection
	public Department(String depName, String depId, Staff[] st) {
		super();
		this.depName = depName;
		this.depId = depId;
		this.st = st;
	}
	
	
	public void	 Departmentdetails()
	{

		System.out.println("Department details are:: ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println("Department name: "+ depName);
		System.out.println("Department Id: "+ depId);
		System.out.println("Staff details are:   ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println();
		
		
		for (Staff staff : st) 
		{
						System.out.println("Staff ID is: "+staff.sid);
						System.out.println("Staff name is: "+staff.sname);
						System.out.println("Staff Address is: "+staff.saddr);
						System.out.println();
		}
		
		
	
	
	
	
	

}
}