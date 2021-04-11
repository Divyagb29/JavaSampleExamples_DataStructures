import java.util.Scanner;


class Launch1
{
	void fun1()
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
class Launch2
{
	void fun2()
	{
		Launch1 r1 = new Launch1();
		r1.fun1();
	}
}
class Launch3
{
	void fun3()
	{
		Launch2 r2 = new Launch2();
		r2.fun2();
	}
}
class Propagations 
{
public static void main(String ag[])
{
	Launch3 r3  = new Launch3();
	r3.fun3();
}
}
