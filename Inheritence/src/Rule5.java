class Sparsha extends Object
{
	int a;
	Sparsha()
	{
		a=12;
	}
	
}
class Divya2 extends Sparsha
{
	int b;
	Divya2()
	{
		b=14;
	}
	
}
class Divya3 extends Sparsha
{
	int c;
	Divya3()
	{
		c=15;
	}
	void div()
	{
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
}

class Rule5 //child cannot access the grand-parent's members 
{
public static void main(String ag[])
{
	Divya3 d = new Divya3();
	d.div();

}
}
