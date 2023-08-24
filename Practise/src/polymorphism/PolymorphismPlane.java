package polymorphism;

class Plane
{
	public void fly()
	{
		System.out.println("plane is flying");
	}
	public void takeOff()
	{
		System.out.println("plane is taking Off");
	}
	public void landing()
	{
		System.out.println("plane is lamding");
	}
}
class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("cargoplanes fly at medium level");
	}
	public void fuelQty() 
	{
		System.out.println("MOre fuel");
		
	}
}
class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("passenger plane flies at high level");
	}
	public void fuelQty() 
	{
		System.out.println("MOre fuel than cargo");
		
	}
}
class FighterPlane extends Plane
{
	public void fly() 
	{
		System.out.println("fighter plane flies at low level");
	}
	public void fuelQty() 
	{
		System.out.println("MOre fuel than all");
		
	}
}

class Airportpermit
{
	public void permit(Plane plane) 
	{
		plane.fly();
		plane.landing();
		plane.takeOff();
		
		
		
	}
}

public class PolymorphismPlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cg = new CargoPlane();
		PassengerPlane pp  = new PassengerPlane();
		FighterPlane fp= new FighterPlane();
		
		Airportpermit ap= new Airportpermit();
		ap.permit(cg);
		ap.permit(fp);
		ap.permit(pp);  // here the method permit has arguments of type Plane which is a parent type
						// so it is of loose coupling.

	}

}
