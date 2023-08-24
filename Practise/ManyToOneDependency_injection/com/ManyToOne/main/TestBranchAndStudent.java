package com.ManyToOne.main;

import com.ManyToOne.bean.Branch;
import com.ManyToOne.bean.Student;

public class TestBranchAndStudent {

	public static void main(String[] args) 
	{
		Branch bb=new Branch("IND2023", "ENGG");
		Student stu1=new Student("TAR1362", "Tarun", "Hyd", bb);
		Student stu2=new Student("TAR1363", "Tarunn", "Hyd", bb);
		Student stu3=new Student("TAR1364", "Tarunmmm", "Hyd", bb);
		
		stu1.Studentdetails();
		stu2.Studentdetails();
		stu3.Studentdetails();

		

	}

}
