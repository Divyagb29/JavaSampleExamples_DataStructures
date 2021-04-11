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
	class Diss1
	{
		Scanner sc = new Scanner(System.in);
		int Account_num = 112233;
		int acc;
	 	void input1()
	 	 {
	 		System.out.println("enter the account number");
	 		acc = sc.nextInt();
	 	 }
	 	void verify1() throws CustomerAccountException
	 	 	{
		 	 	if(Account_num==acc)
		 	 	{
		 	 				 	 	}
		 	 	else
		 	 	{
		 	 		CustomerAccountException cae = new CustomerAccountException();
		 	 		System.out.println(cae.getMessage());
		 	 		throw cae;

		 	 	}
	 	 	}
	}
	class Diss2 
	{
		Scanner sc = new Scanner(System.in);
		int Password = 1212;
		int psw;
	 	void input2() throws CustomerPasswordException
	 	{
	 		System.out.println("enter the password");
	 		psw = sc.nextInt();
	 	}
	 	void verify2() throws CustomerPasswordException
	 	{
	 	 if(Password==psw)
	  	{
	  		
	  	}
	 	 else
	 	 {
	 		CustomerPasswordException cpe = new CustomerPasswordException();
	  		System.out.println(cpe.getMessage());
	  		throw cpe; 
	 	 }
		}
	}
	class Diss3 
	{
		Scanner sc = new Scanner(System.in);
		int denom1=500,denom2=1000,denom3=2000;
		int denom;
 	   void input3()
 	   {
 		System.out.println("enter the amount only 500,1000,2000");
 		denom = sc.nextInt();
 	   }
 	   void verify3() throws CustomerDenominationException
 	   {
	 	   if(denom1==500 || denom2==1000 || denom3==2000)
	 	   {
	 		System.out.println("plz collect your cash");
	       }	
	 	   else
	 	   {
	 		  CustomerDenominationException cde = new CustomerDenominationException();
	 		  System.out.println(cde.getMessage());
	 		  throw cde;
	 	   }
 	}
	}
 class StanderdCharted
 {
 	void initiate()
 	{
 		try
 		{
 			Diss1 d1 = new Diss1();
 			Diss2 d2 = new Diss2();
 			Diss3 d3 = new Diss3();
 			
 			d1.input1();
 			d1.verify1();
 			d2.input2();
 			d2.verify2();
 			d3.input3();
 			d3.verify3();
 			
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
 		finally
 		{
 			System.out.println("Thank You");
 		}
 	}
 }
 class StanderdChartedBank
 {
 public static void main(String ag[])
 {
 	StanderdCharted b = new StanderdCharted();
 	b.initiate();
 }
 }
