class Plane extends Object
{
	void takeoff()
	{
		System.out.println("plane takeoff");
	}
	void lands()
	{
		System.out.println("plane lands");
	}
	void fly()
	{
		System.out.println("plane flys");
	}
}
class cargoPlane extends Plane
{
	void fly()
	{
		System.out.println("cargo plane flys slow");
	}
	void cc()
	{
		System.out.println("cargo plane carries cargos");
	}
}
class passengerPlane extends Plane
{
	void fly()
	{
		System.out.println("passenger plane flys medium");
	}
	void cp()
	{
		System.out.println("passenger plane carries passengers");
	}
}
class fighterPlane extends Plane
{
	void fly()
	{
		System.out.println("fighter plane flys fast");
	}
	void fp()
	{
		System.out.println("fighter plane carries wepons");
	}
}
class Method1
{
public static void main(String ag[])
{
	cargoPlane c = new cargoPlane();
	passengerPlane p = new passengerPlane();
	fighterPlane f = new fighterPlane();
	c.takeoff();
	c.lands();
	c.fly();
	c.cc();
	
	p.takeoff();
	p.lands();
	p.fly();
	p.cp();
	
	f.takeoff();
	f.lands();
	f.fly();
	f.fp();
}
}
