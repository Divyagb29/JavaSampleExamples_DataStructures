import java.util.Scanner;
class RollnumNotException extends Exception
{
	public String getMessage()
	{
		return"rollnumber not found";
	}
}

class RollnumException extends Exception
{
	public String getMessage()
	{
		return"invalid rollnumber";
	}
}

class NameException extends Exception
{
	public String getMessage()
	{
		return"invalid characters";
	}
}
class AgeException extends Exception
{
	public String getMessage()
	{
		return"invalid Age";
	}
}
class GenderException extends Exception
{
	public String getMessage()
	{
		return"invalid Gender";
	}
}
class ClassException extends Exception
{
	public String getMessage()
	{
		return"invalid Class";
	}
}
class Student
{
	Scanner sc = new Scanner(System.in);
	int e[] = new int[3];
	String a[] = new String[3];
	  int b[] = new int[3];
	  String c[] = new String[3];
	  int d[] = new int[3];
	  
	int i;
	void input()throws NameException,AgeException,GenderException,ClassException,RollnumException 
	{ 
	  
	  for(i=1;i<=a.length-1;i++)
	  {
	  System.out.println("Enter the details of student :"+i);
	  System.out.println("Enter the Roll Number :");
	  e[i]=sc.nextInt();
	  if(e[i]>4)
	  {
		  RollnumException re = new RollnumException();
		  System.out.println(re.getMessage());
		  throw re;
	  }
	  System.out.println("Enter the name :");
	  a[i]=sc.next();
	  if(a[i].length()>15)
	  {
		  NameException ne = new NameException();
		  System.out.println(ne.getMessage());
		  throw ne;
	  }
	  System.out.println("Enter the age");
	  b[i]=sc.nextInt();
	  if(b[i]>15)
	  {
		  AgeException ae = new AgeException();
		  System.out.println(ae.getMessage());
		  throw ae;
	  }
	  System.out.println("Enter the Gender");
	  c[i]=sc.next();
	  String m = "male",f = "female";
	  if(c[i].contains(m) || c[i].contains(f))
	  {
		  //prints m or f
	  }
	  else
	  {
		  GenderException ge = new GenderException();
		  System.out.println(ge.getMessage());
		  throw ge;
	  }
	  System.out.println("Enter the Class :");
	  d[i]=sc.nextInt();
	  if(d[i]>10)
	  {
		  ClassException ce = new ClassException();
		  System.out.println(ce.getMessage());
		  throw ce;
	  }
	}
}
	void display()
	{
		 for(i=1;i<=a.length-1;i++)
		 {
			  System.out.println("Details of student--------------:"+i);
			  System.out.println("Roll number : " +e[i]);
			  System.out.println("Name : " +a[i]);
			  System.out.println("Age : " +b[i]);
			  System.out.println("Gender : " +c[i]);
			  System.out.println("Class : " +d[i]); 
		 }
	}
	void retraiving() throws RollnumNotException
	{
		 System.out.println("_________________________________________");
		 System.out.println("enter the roll number to retrive the data");
		 for(i=1;i<a.length;i++)
		 {
			 
		 int x = sc.nextInt();
	     if(e[i]==x)
		{
			System.out.println("Roll number : " +e[i]);
			  System.out.println("Name : " +a[i]);
			  System.out.println("Age : " +b[i]);
			  System.out.println("Gender : " +c[i]);
			  System.out.println("Class : " +d[i]);
			  
		}
		else
		{
			RollnumNotException  rnf = new  RollnumNotException();
			 System.out.println(rnf.getMessage());
			 throw rnf;
		}
		 }
	}
}
class StudentDB
{
public static void main(String ag[])
{
	try
	{
	Student s = new Student();
	s.input();
	s.display();
	for(;;)
	{
    	s.retraiving();
	}
	}
	catch(RollnumException re)
	{
		 System.out.println("enter the roll number up to 4 numbers");
	}
	catch(NameException ne)
	{
		 System.out.println("enter characters up to 15 only");
	}
	catch(AgeException ne)
	{
		 System.out.println("enter age upto 16 years");
	}
	catch(GenderException ge)
	{
		 System.out.println("enter only male or female");
	}
	catch(ClassException ge)
	{
		 System.out.println("enter the class which you are study with in 10th std");
	}
	catch( RollnumNotException rnf)
	{
		 System.out.println("i cant fetch the data of above roll number");
	}
	catch(Exception e)
	{
		 System.out.println("Sorry i cant handle like this type if inputs");
	} 
	finally
	{
		System.out.println("********THANK YOU********");
	}
	
}
}
