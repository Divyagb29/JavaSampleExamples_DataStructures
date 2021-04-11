import java.util.Scanner;
class Exceptions2
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
	    System.out.println("please enter the size of an array : ");
	    int size = sc.nextInt();
	    int ar[]=new int[size];
	    System.out.println("enter the element to an array : ");
	    int ele = sc.nextInt();
	    System.out.println("enter in which location u want to put an element : ");
	    int loc = sc.nextInt();
	     ar[loc] = ele;
	    System.out.println(ar[loc]);
	}
	catch(ArithmeticException e)
	{
		System.out.println(" enter the proper divisor ");
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println(" enter the valid size of an array ");
	}
	catch(NegativeArraySizeException p)
	{
		System.out.println(" enter only +ve size ");
	}
	catch(Exception n)
	{
		System.out.println(" sorry i cant handle it");
	}
	System.out.println("connection terminated");
}
}
