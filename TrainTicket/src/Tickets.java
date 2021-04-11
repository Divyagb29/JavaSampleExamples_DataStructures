import java.util.Scanner;
import java.util.Date;
class InvalidTrainNumberException1 extends Exception
{
	public String getMessage()
	{
		return "invalid train number";
	}
}
class InvalidDateException extends Exception
{
	public String getMessage()
	{
		return "invalid Date";
	}
}
class Ammu
{
	Scanner scan = new Scanner(System.in);
	int train1 = 1111;
	int train2 = 2222;
	int train3 = 3333;
	int train4 = 4444;
	int train5 = 5555;
	int t1,t2,t3,t4,t5;
	
	void input1() throws InvalidTrainNumberException1,InvalidDateException
	{
		Date currentDate = new Date();
		System.out.println("WELCOME TO BANGLORE RAILWAYS   *******   " + currentDate );
		System.out.println("Enter The Ticket Number : ");
		t1 = scan.nextInt();
		if(train1==t1)
		{
			System.out.println("*******Proceed to enter details*******");
			System.out.println("Enter Name:");
			String name = scan.next();
			System.out.println("Enter Age:");
			int age = scan.nextInt();
		}
		else
		{
			InvalidTrainNumberException1 ine = new InvalidTrainNumberException1();
			System.out.println(ine.getMessage());
			throw ine;
		}
		System.out.println("Enter Date:");   
		int dd = scan.nextInt();
		if(currentDate.before(currentDate))
		{
			InvalidDateException  ide = new InvalidDateException();
			System.out.println(ide.getMessage());
			throw ide;
		}
		else
		{
			System.out.println("Proceed to Collect Tickets");
		}
	}
}
	
class Tickets
{
public static void main(String ag[])
{
	try
	{
	Ammu a =new Ammu();
	for(;;)
	{
	a.input1();
	}
	}
	catch(InvalidTrainNumberException1 ine)
	{
		System.out.println("Enter the valid train number ");
	}
	catch(InvalidDateException ide)
	{
		System.out.println("Enter the valid Date format to collect tickets");
	}
	catch(Exception e)
	{
		System.out.println("Sorry i cant handle like this type of inputs");
	}
    finally
    {
	System.out.println("****THANK YOU****");
    }
}
}
