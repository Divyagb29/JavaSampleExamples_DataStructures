class Audi extends Object //calling only non parameterised constructor
{
	int a;
	int b;
	Audi()
	{
		a=10;
		b=20;
	}
	Audi(int m, int n)
	{
		a=m;
		b=n;
	}
}
class Audi1 extends Demo1
{
	int c;
	int d;
	 Audi1()
	{
		c=50;
		d=30;
	}
	 Audi1(int p, int q)
	{
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

class Exp2 
{
public static void main(String ag[])
{
	Audi1 a = new Audi1(11,22);
	a.display();
}
}
