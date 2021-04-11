import java.util.Scanner;
interface Calsi
{
	void add();
	void sub();
}
class Calsi1 implements Calsi
{
	public void add()
	{
		int a=10,b=12,c;
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=10,b=12,c;
		c=a-b;
		System.out.println(c);
	}
}
class Calsi2 implements Calsi
{
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("enter the value of b : ");
		int b=sc.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	public void sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("enter the value of b : ");
		int b=sc.nextInt();
		int c = a-b;
		System.out.println(c);	
	}
}
class Calsi3 implements Calsi
{
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("enter the value of b : ");
		int b=sc.nextInt();
		int c = a+b;
		if(a==0||b==0)
		{
		System.out.println("enter valid input");
		}
		else
		{
			System.out.println(c);
		}
	}
	public void sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a : ");
		int a=sc.nextInt();
		System.out.println("enter the value of b : ");
		int b=sc.nextInt();
		int c = a-b;
		if(a==0||b==0)
		{
		System.out.println("enter valid input");
		}
		else
		{
			System.out.println(c);
		}	
	}
	class Maths()
    {
		public void divya(Calsi c)
		{
	      		c.add();
	      		c.sub();
		}
	}
 class Interfaces
{
public static void main(String arg[])
{
	Calsi1 c1 = new Calsi1();
	Calsi2 c2 = new Calsi2();
	Calsi3 c3 = new Calsi3();
	
	Maths m = new Maths();
	m.divya(c1);
	m.divya(c2);
    m.divya(c3);	
}
}