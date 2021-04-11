import java.util.Scanner;
class InvalidAccountException extends Exception
{
	public String getMessege()
	{
		return"Invalid Account Number";
	}
}
class InvalidPasswordException extends Exception
{
	public String getMessage()
	{
		return"Invalid Password";
	}
}
class InvalidDenomException extends Exception
{
	public String getMessage()
	{
		return"Invalid Denomination";
	}
}
class Aishi
{
	Scanner sc = new Scanner(System.in);
	int ac,pw,de;
	int Account_Number1 = 1111;
	int Account_Number2 = 2222;
	int Account_Number3 = 3333;
	
	int Password1 = 101;
	int Password2 = 102;
	int Password3 = 103;
	
	int Denom1 = 500;
	int Denom2 = 1000;
	int Denom3 = 2000;
	
	void input1()
	{
		System.out.println("Enter the Account Number : ");
		ac = sc.nextInt();	
	}
	void verify1()throws InvalidAccountException
	{
		if(Account_Number1==ac||Account_Number2==ac||Account_Number3==ac)
		{
			System.out.println("");
		}
		else
		{
			InvalidAccountException iae = new InvalidAccountException();
			System.out.println(iae.getMessage());
			throw iae;
		}
		
	}
	void input2()
	{
		System.out.println("Enter the Password : ");
		pw = sc.nextInt(); 
	}
	void verify2()throws InvalidPasswordException
	{
		if(Password1==pw||Password2==pw||Password3==pw)
		{
			System.out.println("");
		}
		else
		{
			InvalidPasswordException ipe = new InvalidPasswordException();
			System.out.println(ipe.getMessage());
			throw ipe;
		}
	}
	void input3()
	{
		System.out.println("Enter the Denomination Amount");
		de = sc.nextInt();
	}
	void verify3()throws InvalidDenomException 
	{
		if(Denom1==de||Denom2==de||Denom3==de)
		{
			System.out.println("plz collect your cash");
		}
		else
		{
			InvalidDenomException ide = new InvalidDenomException();
			System.out.println(ide.getMessage());
			throw ide;
		}
	}
}
class Hdfc
{
	void initiate()
	{
		try
		{
			Aishi a = new Aishi();
			a.input1();
			a.verify1();
			a.input2();
			a.verify2();
			a.input3();
			a.verify3();
          			
		}
		catch(InvalidAccountException iae)
		{
			System.out.println("Plz enter valid Account Number");
		}
		catch(InvalidPasswordException ipe)
		{
			System.out.println("Plz enter valid Password");
		}
		catch(InvalidDenomException ide)
		{
			System.out.println("Plz enter valid Denominations like 500 1000 2000");
		}
		finally
		{
			System.out.println("Thank You fo Transaction");
		}
		
	}
}
class Atm1
{
	public static void main(String ag[])
	{
		Hdfc b = new Hdfc();
		b.initiate();
	}
}