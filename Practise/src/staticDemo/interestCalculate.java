package staticDemo;

import java.util.Scanner;

class Farmer{
	
	private double principleAmount;
	private double noOfYears;
	private double Simpleinterest;
	private  static double rateOfinterestPerAnnum;
	
	static
	{
		rateOfinterestPerAnnum=3d;
		
	}
/*	Farmer(double pa,double duration)
	{
		this.principleAmount=pa;
		this.noOfYears=duration;
		
	}*/
	void input()
	
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount");
		principleAmount =sc.nextDouble();
		System.out.println("enter the duration in years");
		noOfYears=sc.nextDouble();
	}
	void calculate()
	{
		Simpleinterest=(principleAmount*noOfYears*rateOfinterestPerAnnum)/100;
	}
	void display() {
		System.out.println("Simple interest is "+ Simpleinterest);
		System.out.println("Total amount to given as per simple interest is "+ (principleAmount+Simpleinterest));
	}
	
	
	
}

public class interestCalculate {

	public static void main(String[] args) 
	{
		
		Farmer f1= new Farmer();
		f1.input();
		f1.calculate();
		f1.display();
		Farmer f2= new Farmer();
		f2.input();
		f2.calculate();
		f2.display();
	}

}
