import java.util.Scanner;

class Demo1
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
class Demo2 extends Demo1
{
	void fun2()
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("connection established");
	    int a,b,c;
	    System.out.println("enter the value of a : ");
	    a = sc.nextInt();
	    System.out.println("enter the value of b : ");
	    b = sc.nextInt();
	    System.out.println("enter the value of c : ");
	    c = sc.nextInt();
	    int d = a+b+c;
	    System.out.println(d);
	    System.out.println("enter the value of f : ");
	    int f = sc.nextInt();
	    int e = d/f;
	    System.out.println(e);
	    
	}
}
 class Liscas1 
{
public static void main(String ag[])
{
	Demo2 d = new Demo2();
	d.fun2();

}
}
