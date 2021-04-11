import java.util.Scanner;
class NameException extends Exception
{
	public String getMessage()
	{
		return "invalid characters";
	}
}
class Ammu
{
	Scanner sc = new Scanner(System.in);
	String a = "abcdefghijklmnopqrstuvwxyz";
	char[] c = a.toCharArray();
	void nam() throws NameException
	{
		try
		{
			for(int i=1;i<=c.length;i++)
			{
				System.out.println("Enter the details of student:"+i);
				System.out.println("Enter the name : ");
				a = sc.next();
				if(a.length()<=15 || a.equals(c))
				{
					
				}
				else
				{
					NameException n = new NameException();
					System.out.println(n.getMessage());
					throw n;
				}	
			}
		}
		catch(NameException n)
		{
			System.out.println("pls enter valid characters up 15");
		}
		finally
		{
			System.out.println("Thank you");
		}
	}
}
class OnlyName
{
	public static void main(String ag[])
	{
		try
		{
			Ammu a = new Ammu();
			a.nam();
		}
		catch(Exception e)
		{
			System.out.println("plz enter valid name");
		}
	}
}

