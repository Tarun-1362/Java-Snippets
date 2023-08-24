package com.prac.main;

import com.prac.bean.Employee;
import com.prac.bean.account;

public class Testemployee {

	public static void main(String[] args) 
	{
		account Account=new account("Sarikonda", "1362", "savings");
		
		
		
		//Constructor injection the object of account type is injected through the constructor of the 
		// Employee class which is the target object
		Employee emp=new Employee("Tarun Kumar", "IND016", "Hyderabad", Account);
		emp.getEmployee();
		
		

	}

}
