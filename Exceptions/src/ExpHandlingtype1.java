
import java.util.Scanner;
import java.util.Scanner;


class Divya
{
	void fun1()
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
		}
	}
}
class ExpHandlingtype1 
{
public static void main(String ag[])
{
	Divya r3  = new Divya();
	r3.fun1();
}
}
