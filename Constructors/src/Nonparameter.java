class Ammuji
{
	int a;
	int b;
	Ammuji(int m,int n)
	{
		a=m;
		b=n;
	}
	void print1()
	{
		System.out.println(a);
	}
	void print2()
	{
		System.out.println(b);
	}
}
 class Nonparameter 
{
public static void main(String ag[])
{
	Ammuji a = new Ammuji(12,23);
	a.print1();
	a.print2();
}
}
