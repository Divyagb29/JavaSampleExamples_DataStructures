class Juice
{
	void color()
	{
		System.out.println("juice has diffarent color");
	}
	void print()
	{
		System.out.println("prints diffarent color");
	}
}
class Fanta extends Juice
{
	void color()
	{
		System.out.println("fanta has orange color");
	}
	void print()
	{
		System.out.println("print orange color");
	}
}
class Pepsi extends Juice
{
	void color()
	{
		System.out.println("pepsi has dark blue color");
	}
	void print()
	{
		System.out.println("print dark blue color");
	}
}
class Coke extends Juice
{
	void color()
	{
		System.out.println("coke has a brown color");
	}
	void print()
	{
		System.out.println("print brown color");
	}
}
class Version1exp2 
{
public static void main(String ag[])
{
	Fanta f = new Fanta();
	Pepsi p = new Pepsi();
	Coke c = new Coke();
	
	Juice j;
	j=f;
	j.color();
	j.print();
	
	j=p;
	j.color();
	j.print();
	
	j=c;
	j.color();
	j.print();
}
}
