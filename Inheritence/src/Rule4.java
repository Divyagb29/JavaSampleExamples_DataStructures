class Chitti extends Object //multilevel inheritence is possible
{
	void print1()
	{
		System.out.println("print1 value is a");
	}
}
class Chitti1 extends Chitti2
{
	void print2()
	{
		System.out.println("print2 value is b");
	}
}
class Chitti2 extends Chitti1//cyclic inheritence is not possible
{
	void print3()
	{
		System.out.println("print3 value is c");
	}
}
class Rule4
{
public static void main(String ag[])
{
	Chitti2 p = new Chitti2();
	p.print3();
	
}
}
