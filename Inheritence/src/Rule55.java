class Demo1 extends Object
{
	int a;
	Demo1()
	{
		a=10;
	}
}
class Demo2 extends Demo1
{
	int b;
	Demo2()
	{
		b=50;
	}
}
class Demo3 extends Demo1
{
	int c;
	Demo3()
	{
		c=10;
	}
	void get()
	{
		System.out.println(a);
		System.out.println(b);//child cannot access the grand parent members
		System.out.println(c);
	}
}
class Rule55
{
public static void main(String ag[])
{
	Demo3 d  = new Demo3();
	d.get();
}
}
