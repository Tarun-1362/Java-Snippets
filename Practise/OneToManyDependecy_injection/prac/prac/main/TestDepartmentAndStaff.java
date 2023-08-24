package prac.prac.main;

import com.prac.bean.Department;
import com.prac.bean.Staff;

public class TestDepartmentAndStaff {

	public static void main(String[] args) {
		Staff s1=new Staff("Tarun", "IND1362", "IND");
		Staff s2=new Staff("Tharun", "IND1363", "IND");
		Staff s3=new Staff("Tharunn", "IND1364", "IND");
		
		Staff[] st= new Staff[3];
		
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		
		
		Department ddc=new Department("mech", "303", st);
		ddc.Departmentdetails();
		
		



	}

}
