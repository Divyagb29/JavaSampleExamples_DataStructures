import java.util.Scanner;
class Launch
{
	public static void main(String ag[])
	{
		for(;;)
		{
		try
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("Connction Established");
				System.out.println("Enter the value of a");
				int a = sc.nextInt();
				System.out.println("Enter the value of b");
				int b = sc.nextInt();
				int c = a/b;
				System.out.println(c);
				System.out.println("Enter the size of an array");
				int size = sc.nextInt();
				int ar[] = new int[size];
				System.out.println("enter the element to be inserted");
				int ele = sc.nextInt();
				System.out.println("in which position u want to insert");
				int pos = sc.nextInt();
				ar[pos] =ele;
				System.out.println(ar[pos]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("plz give a proper divisor");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("give a proper array size");
		}
		catch(NegativeArraySizeException nae)
		{
			System.out.println("give only +ve value of size");
		}
		catch(Exception e)
		{
			System.out.println("Sorry i cant handle");
		}
		System.out.println("----------Connction Terminated---------");	
	}
}
}