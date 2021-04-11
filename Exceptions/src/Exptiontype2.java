import java.util.Scanner;

class Chitti
{
	void fun1() throws ArithmeticException
	{
		try
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
		catch(ArithmeticException e)
		{
			System.out.println("enter proper diviser ");
			throw e;
		}
		finally
		{
			System.out.println(" connection terminated ");
		}

	}
}
class Exptiontype2
{
public static void main(String ag[])
{
	try
	{
		Chitti t = new Chitti();
		t.fun1();
	}
	catch(Exception e)
	{
		System.out.println(" i have also handled it ");
	}
}
}
