import java.util.*;
class Reverse 
{
	public static void main(String ag[])
	{
		String x = "gudal";
		
		char y[] = x.toCharArray();
		int size = x.length();
		char z[] = new char[size];
		int i = 0;
		while(i!=size)
		{
			z[size-1-i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(z);
		i=0;
		while(i!=size)
		{
			if(z[i]!=y[i])
			{
				System.out.println("not a palindrome");
				System.exit(0);
			}
			else
			{
				i++;
				continue;
			}
			System.out.println("palindrome");
		}
		
	}
}
