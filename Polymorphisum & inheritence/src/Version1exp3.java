class Amma
{
	void eat()
	{
		System.out.println("eat1");
	}
	void cry()
	{
		System.out.println("cry1");
	}
}
class Amma1 extends Amma
{
	void eat()
	{
		System.out.println("eat eat1");
	}
	void sleep()
	{
		System.out.println("eat cry sleep");
	}	
}
class Amma2 extends Amma
{
	void eat()
	{
		System.out.println("eat eat1 eat2");
	}
	void sleep()
	{
		System.out.println("eat cry sleep sleep1");
	}	
}
class Amma3 extends Amma
{
	void eat()
	{
		System.out.println("eat eat1 eat2 eat3");
	}
	void sleep()
	{
		System.out.println("eat cry sleep sleep1 sleep2");
	}	
}
class Version1exp3
{
public static void main(String ag[])
{
	Amma1 c1 = new Amma1();
	Amma2 c2 = new Amma2();
	Amma3 c3 = new Amma3();
	
	Amma p;
	p=c1;
	p.eat();
	p.cry();
    ((Amma1)(p)).sleep();
    
    p=c2;
	p.eat();
	p.cry();
    ((Amma2)(p)).sleep();
	
    p=c3;
	p.eat();
	p.cry();
    ((Amma3)(p)).sleep();
	
}
}
