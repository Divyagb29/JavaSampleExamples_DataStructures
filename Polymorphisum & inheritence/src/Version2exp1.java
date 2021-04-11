class Animal
{
	void eat()
	{
		System.out.println("eats");
	}
	void sleeps()
	{
		System.out.println("sleeps");
	}
	void breathe()
	{
		System.out.println("breathes");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("tiger eats animals");
	}
	
}
class Deer extends Animal
{
	void eat()
	{
		System.out.println("deer eats grass");
	}
	
}
class Monkey extends Animal
{
	void eat()
	{
		System.out.println("Monkey eats fruits");
	}
	
}
class Forest
{
	void ammu(Animal a)
	{
		a.eat();
		a.sleeps();
		a.breathe();
	}
}
 class Version2exp1
{
public static void main(String ag[])
{
	Tiger t = new Tiger();
	Deer d = new Deer();
	Monkey m = new Monkey();
	
	Forest f = new Forest();
	f.ammu(t);
	f.ammu(d);
	f.ammu(m);
	
}
}
