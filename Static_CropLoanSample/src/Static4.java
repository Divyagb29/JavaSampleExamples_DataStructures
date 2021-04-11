class Chitti
{
	static int a;
	static int b;
	static int c;
	
	int d;
	int e;
	int f;
	
	static
	{
		a=2;
		b=6;
		c=8;
	}
	{
		d=22;
		e=34;
		f=23;
	}
	static void display1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void display2()
	{
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
class Static4 
{
	public static void main(String ag[])
	{
      Chitti m = new Chitti();
     
      Chitti.display1();
      m.display2();
	}

}
