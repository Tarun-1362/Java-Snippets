package com.ManyToManyDependency.test;

import com.ManyToManyDependency.bean.Courses;
import com.ManyToManyDependency.bean.Students;
import com.ManyToOne.bean.Student;

public class TestStudentAndCourses {

	public static void main(String[] args)
	{
		
		Courses c1= new Courses("a001", "Java", 14000);
		Courses c2= new Courses("a002", "Java", 14000);
		Courses c3= new Courses("a001", "Java", 14000);
		
		
		Courses[] course=new Courses[3];
		
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		Students s1= new Students("IND18", "Kohli", "India", course);
		Students s2= new Students("IND18", "Kohli", "India", course);
		Students s3= new Students("IND18", "Kohli", "India", course);
		
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
	}

}
