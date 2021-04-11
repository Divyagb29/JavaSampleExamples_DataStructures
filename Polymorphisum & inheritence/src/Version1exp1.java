class Parent
{
	void cry()
	{
		System.out.println("parent cries");
	}
}
class Child1 extends Parent
{
	void cry()
	{
		System.out.println("child1 cries");
	}
}
class Child2 extends Parent
{
	void cry()
	{
		System.out.println("child2 cries");
	}
}
class Child3 extends Parent
{
	void cry()
	{
		System.out.println("child3 cries");
	}
}

class Version1exp1 
{
public static void main(String ag[])
{
	 Child1 c1 = new Child1();
	 Child2 c2 = new Child2();
	 Child3 c3 = new Child3();
	 
	 Parent p;
	 p=c1;
	 p.cry();
	 
	 p=c2;
	 p.cry();
	 
	 p=c3;
	 p.cry();
	 
	 
}
}
