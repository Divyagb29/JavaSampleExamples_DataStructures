class Tatto extends Object //calling by this() & super() parameteraised keyword constructor
{
	int a;
	int b;
	Tatto()
	{
		a=10;
		b=20;
	}
	Tatto(int m, int n)
	{
		a=m;
		b=n;
	}
}
class Tatto1 extends Demo1
{
	int c;
	int d;
	Tatto1()
	{
		this(300, 688);
		c=50;
		d=30;
	}
	Tatto1(int p, int q)
	{
		super(199,244);
		c=p;
		d=q;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Exp4
{
public static void main(String ag[])
{
	Tatto1 a = new Tatto1(11,22);
	a.display();
}
}
