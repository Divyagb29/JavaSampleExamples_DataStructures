class Chinni
{
	int a,b;
	Chinni()
	{
		a=12;
		b=20;
	}
	void getprint1()
	{
		System.out.println(a);
	}
	void getprint2()
	{
		System.out.println(b);
	}
}
class Parameter
{
public static void main(String ag[])
{
	Chinni c=new Chinni();
	c.getprint1();
	c.getprint2();
}
}
