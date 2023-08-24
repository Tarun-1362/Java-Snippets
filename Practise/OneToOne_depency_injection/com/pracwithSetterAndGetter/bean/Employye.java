package com.pracwithSetterAndGetter.bean;


//Target Object
public class Employye 
{
	String ename;
	String eid;
	String eaddr;
	
	
	//Has-A dependency 
	Account acc;


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public String getEaddr() {
		return eaddr;
	}


	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}


	public Account getAcc() {
		return acc;
	}


	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void employeedetails()
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
		System.out.println("Account Name:: "+ acc.getAccName());
		System.out.println("Account Id:: "+ acc.getAccId());
		System.out.println("Account Type:: "+ acc.getAccType());		
		
	}

}
