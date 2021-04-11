import java.util.Scanner;
class InvalidRollNumberException extends Exception
{
	public String getMessage()
	{
		return "Invalid Roll Number";
	}
}
class InvalidNameException extends Exception
{
	public String getMessage()
	{
		return "Invalid Name";
	}
}
class InvalidAgeException extends Exception
{
	public String getMessage()
	{
		return "Invalid Age";
	}
}
class InvalidGenderException extends Exception
{
	public String getMessage()
	{
		return "Invalid Gender";
	}
}
class InvalidClassException extends Exception
{
	public String getMessage()
	{
		return "Invalid Class";
	}
}
class Students
{
	Scanner sc = new Scanner(System.in);
	int roll[] = new int[3];
	String name[] = new String[3];
	int age[] = new int[3];
	String gender[] = new String[3];
	int clas[] = new int[3];
	
	int i;
	
	void input1() throws InvalidRollNumberException,InvalidNameException,InvalidAgeException,InvalidGenderException,InvalidClassException
	{
		for(i=1;i<=roll.length-1;i++)
		{
	    	System.out.println("Enter the Details of Student : "+i);
	    	System.out.println("Enter the Roll Number :");
	    	roll[i] = sc.nextInt();
	    	if(roll[i]>=5)
	    	{
	    		InvalidRollNumberException ire = new InvalidRollNumberException();
	    		System.out.println(ire.getMessage());
	    		throw ire;
	    	}
	    	System.out.println("Enter the Name :");
	    	name[i] = sc.next();
	    	if(name[i].length()>=15)
	    	{
	    		InvalidNameException ine = new InvalidNameException();
	    		System.out.println(ine.getMessage());
	    		throw ine;
	    	}
	    	System.out.println("Enter the Age :");
	    	age[i] = sc.nextInt();
	    	if(age[i]>15)
	    	{
	    		InvalidAgeException iae = new InvalidAgeException();
	    		System.out.println(iae.getMessage());
	    		throw iae;
	    	}
	    	System.out.println("Enter the Gender :");
	    	gender[i] = sc.next();
	    	String m = "male";
	    	String f ="female";
	    	if(gender[i].contains(m) || gender[i].contains(f))
	    	{
	    		
	    	}
	    	else
	    	{
	    		InvalidGenderException ige = new InvalidGenderException();
	    		System.out.println(ige.getMessage());
	    		throw ige;
	    	}
	    	System.out.println("Enter Class :");
	    	clas[i] = sc.nextInt();
	    	if(clas[i]>10)
	    	{
	    		InvalidClassException ice = new InvalidClassException();
	    		System.out.println(ice.getMessage());
	    		throw ice;
	    	}
		}  
	}
}
class Std
{
	void initiate()
	{
		try
		{
			Students s = new Students();
		    s.input1();
		}
		catch(InvalidRollNumberException ire)
		{
			System.out.println("plz enter the roll number up to 5");
		}
		catch(InvalidNameException ine)
		{
			System.out.println("enter only Alphabets ");
			System.out.println("plz enter the name up to only 15 characters");
		}
		catch(InvalidAgeException  iae)
		{
			System.out.println("plz enter the age between  5-15 years");
		}
		catch(InvalidGenderException  ige)
		{
			System.out.println("plz enter only male or female");
		}
		catch(InvalidClassException  ice)
		{
			System.out.println("plz enter only male or female");
		}
		catch(Exception e)
		{
			System.out.println("Sorry i cant handle");
		}
	}
}
class StudentDetails
{
	public static void main(String ag[])
	{
       Std p = new Std();
       p.initiate();
	}
}