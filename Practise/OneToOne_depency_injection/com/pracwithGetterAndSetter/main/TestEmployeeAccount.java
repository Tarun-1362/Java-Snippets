package com.pracwithGetterAndSetter.main;

import com.prac.bean.Employee;
import com.pracwithSetterAndGetter.bean.Account;
import com.pracwithSetterAndGetter.bean.Employye;

public class TestEmployeeAccount {

	public static void main(String[] args) 
	{
		
		Account acc= new Account();
		
		
		
		
		acc.setAccId("IND1234");
		acc.setAccName("tarun");
		acc.setAccType("SAvings");
		
		Employye emp= new Employye();
		
		emp.setEname("Tarun");
		emp.setEid("CTS1362");
		emp.setEaddr("IND");
		emp.setAcc(acc);
		emp.employeedetails();

	}

}
