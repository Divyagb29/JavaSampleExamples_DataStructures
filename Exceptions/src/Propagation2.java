import java.util.Scanner;
class Prop1
{
	void fun1() throws ArithmeticException
	{
		
			Scanner sc = new Scanner(System.in);
		    System.out.println("connection established");
		    int a,b,c;
		    System.out.println("enter the value of a : ");
		    a = sc.nextInt();
		    System.out.println("enter the value of b : ");
		    b = sc.nextInt();
		    c=a/b;
		    System.out.println(c);
		
	}
}
class Prop2
{
	void fun2()
	{
		Prop1 p = new Prop1();
		p.fun1();
	}
}
class Propagation2
{
	public static void main(String ag[])
	{
		try
		{
		Prop2 m = new Prop2();
		m.fun2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("give proper diviser");
		}
	}
}
