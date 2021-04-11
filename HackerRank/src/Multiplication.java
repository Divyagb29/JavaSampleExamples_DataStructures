import java.util.*;
class Multiplication
{
	public static void main(String ag[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n :");
		int n = sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(n+ " * "+i+ " = " +n*i);
		}
	}
}
