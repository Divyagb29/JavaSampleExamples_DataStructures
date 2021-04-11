class Ammu extends Object
{
	int a=10,b=20;
	int c=a+b;
	void add()
	{
	System.out.println(c);
    }
}
class Ammu1 extends Ammu
{
	int a=10,b=20;
	int c=a-b;
	void sub()
	{
	System.out.println(c);
    }
}
class Ammu2 extends Ammu1 Ammu //multiple inheritence is not possible
{
	int a=10,b=20;
	int c=a*b;
	void mul()
	{
	System.out.println(c);
    }
}
class Rule2
{
public static void main(String ag[])
{
	Ammu2 a = new Ammu2();
   a.mul();
   a.sub();
   a.add();
}
}
