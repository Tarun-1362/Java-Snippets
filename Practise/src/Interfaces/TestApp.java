package Interfaces;

public class TestApp {

	public static void main(String[] args) {
		
			ISample n = new SubSampleImpl();//Loose coupling
			n.m1();
			n.m2();
			
		

	}

}
