package com.Dependency_injection;

public class Student 
{
	// instance variables
		private Integer srollNumber;
		private Integer sphone;
		private String sname;
		
	//constructor to set a value
	public Student(Integer srollNumber, Integer sphone, String sname) 
	{
		super();
		this.srollNumber = srollNumber;
		this.sphone = sphone;
		this.sname = sname;
	}
	
	
	


	
	// or use the below setters to set the values
	// setters to inject dependencies
	public void setSrollNumber(Integer srollNumber) 
	{
		this.srollNumber = srollNumber;
	}
	public void setSphone(Integer sphone) 
	{
		this.sphone = sphone;
	}
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student [srollNumber=" + srollNumber + ", sphone=" + sphone + ", sname=" + sname + "]";
	}
	

}



