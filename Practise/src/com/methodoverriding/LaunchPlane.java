package com.methodoverriding;
class Plane
{
	public void fly()
	{
		System.out.println("Plane is flying");
		
	}
	public void land() 
	{
		System.out.println("Plane is Landing");
	}
	public void takeOff() 
	{
		System.out.println("plane is TakingOff");
	}
}
class CargoPlane extends Plane
{
	public void fly() 
	{
		System.out.println("plane flies at lower level");
	}
	public void CarryGoods()
	{
		System.out.println("plane carries goods");
	}
}
class PassengerPlane extends Plane
{
	public void fly() 
	{
		System.out.println("passenger plane flies at medium level");
	}
	public void CarryPassengers()
	{
		System.out.println("passenger plane carries passengers");
	}
}


// here the methods fly are over ridden by the child classes which are already available in the parent class, also
// the methpods of parent cass are accessible by child class like takeOff land().
public class LaunchPlane 
{

	public static void main(String[] args)
	{
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp= new PassengerPlane();
		
		cp.fly();
		cp.takeOff();
		cp.CarryGoods();
		cp.land();
		
		pp.fly();
		pp.takeOff();
		pp.CarryPassengers();
		pp.land();
		
	}

}
