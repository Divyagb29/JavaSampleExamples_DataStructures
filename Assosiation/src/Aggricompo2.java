class Os
{
	String name;
	Os(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
}
class Charger
{
	String brand;
	Charger(String brand)
	{
		this.brand = brand;
	}
	String getBrand()
	{
		return brand;
	}
}
class Dell
{
	Os o = new Os("windows");
	
	void hasa(Charger c)
	{
		System.out.println(c.getBrand());
	}
}
class Aggricompo2
{
public static void main(String ag[])
{
	Dell d = new Dell();
	Charger c = new Charger("Redme");
	d.hasa(c);
	System.out.println(d.o.getName());
}
}
