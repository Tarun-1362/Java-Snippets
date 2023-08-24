package com.prac.bean;

public class Employee 

{
	String ename;
	String eid;
	String eaddr;
	
	
	//Has-A dependency 
	account acc;
	
	
	
	
	//Constructor Injection
	public Employee(String ename,String eid,String eaddr,account acc)
	{
		this.ename=ename;
		this.eid= eid;
		this.eaddr=eaddr;
		this.acc=acc;
	}
	public void getEmployee() 
	{
		System.out.println("employee details are:: ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println("Employee name: "+ ename);
		System.out.println("Employee Id: "+ eid);
		System.out.println("Employee Address "+ eaddr);
		System.out.println("Account details are:: ");
		System.out.println("===========================");
		System.out.println("***************************");
		System.out.println("===========================");
		System.out.println("Account Name:: "+ acc.accName);
		System.out.println("Account Id:: "+ acc.accId);
		System.out.println("Account Type:: "+ acc.accType);


		
	}

}
