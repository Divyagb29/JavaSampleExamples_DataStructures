class Demo1 extends Object //calling only non parametarised constructor
{
	int a;
	int b;
	Demo1()
	{
		a=10;
		b=20;
	}
	Demo1(int m, int n)
	{
		a=m;
		b=n;
	}
}
class Demo2 extends Demo1
{
	int c;
	int d;
	Demo2()
	{
		c=50;
		d=30;
	}
	Demo2(int p, int q)
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

class Exp1 
{
public static void main(String ag[])
{
	Demo2 d = new Demo2();
	d.display();
	
}
}
