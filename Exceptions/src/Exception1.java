import java.util.Scanner;
class Exceptions1
{
public static void main(String ag[])
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
		System.out.println(" enter the proper divisor ");
	}
	
	System.out.println("connection terminated");
}
}
