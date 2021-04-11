import java.util.Scanner;
class CustomerAccountException extends Exception
{
	public String getMessege()
	{
		return"please enter the correct Account number";
	}
}
class CustomerPasswordException extends Exception
{
	public String getMessege()
	{
		return"please enter the correct password";
	}
}
class CustomerDenominationException extends Exception
{
	public String getMessege()
	{
		return"please enter the amount only  500,1000,2000";
	}
}
class Money
{
	int Account_num = 112233;
	int Password = 1212;
	int acc,psw,denom;
	int denom1=500,denom2=1000,denom3=2000;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account number");
		acc = sc.nextInt();
		System.out.println("enter the password");
		psw = sc.nextInt();
		System.out.println("enter the amount only 500,1000,2000");
		denom = sc.nextInt();
		
	}
	void verify() throws CustomerAccountException,CustomerPasswordException,CustomerDenominationException
	{
	if(Account_num!=acc)
	{
		CustomerAccountException cae = new CustomerAccountException();
		System.out.println(cae.getMessage());
		throw cae;
	}
	 if(Password!=psw)
	{
		CustomerPasswordException cpe = new CustomerPasswordException();
		System.out.println(cpe.getMessage());
		throw cpe;
	}
	 if(denom1!=500 && denom2!=1000 && denom3!=2000)
	{
		 CustomerDenominationException cde = new CustomerDenominationException();
		 System.out.println(cde.getMessage());
		 throw cde;
	}
	 else
	 {
		 System.out.println("plz collect your cash");
	 }
	}
}
class SbiBank
{
	void initiate()
	{
		Money a = new Money();
		try
		{
		  a.input();
		  a.verify();
		}
		catch(CustomerAccountException cae)
		{
			System.out.println("plz enter vaalid account number");
		}
		catch(CustomerPasswordException cpe)
		{
			System.out.println("plz enter vaalid password");
		}
		catch(CustomerDenominationException cde)
		{
			System.out.println("plz enter correct amount");
		}
		catch(Exception e)
		{
			System.out.println("THANK YOU FOR THE TRANSACTION");
		}
	}
}
class CustomExpAtm
{
public static void main(String ag[])
{
	SbiBank b = new SbiBank();
	b.initiate();
}
}
