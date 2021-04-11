class Chitti extends Object //multilevel inheritence is possible
{
	void print1()
	{
		System.out.println("print1 value is a");
	}
}
class Chitti1 extends Chitti
{
	void print2()
	{
		System.out.println("print2 value is b");
	}
}
class Chitti2 extends Chitti1
{
	void print3()
	{
		System.out.println("print3 value is c");
	}
}
class Rule3 
{
public static void main(String ag[])
{
	Chitti2 p = new Chitti2();
}
}
