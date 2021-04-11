class Swift extends Object //calling  parameterised super() constructor
{
	int a;
	int b;
	Swift()
	{
		a=10;
		b=20;
	}
	Swift(int m, int n)
	{
		a=m;
		b=n;
	}
}
class Swift1 extends Demo1
{
	int c;
	int d;
	Swift1()
	{
		c=50;
  		d=30;
	}
	 Swift1(int p, int q)
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

class Exp3
{
public static void main(String ag[])
{
	Swift1 a = new Swift1(11,22);
	a.display();
}
}
