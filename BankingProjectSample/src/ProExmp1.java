import java.util.*;
class ProExmp1
{
	public static void main(String ag[])
	{
		BankingApplication ba = new BankingApplication("xyz","BA4567");
		ba.Menu();
	}
}
class BankingApplication
{
	int balence;
	int lastTransaction;
	String CustmorName;
	String CustomerID;
	
	BankingApplication(String cname,String cid)
	{
		CustmorName =cname;
		CustomerID = cid;
	}
	void Balence(int amount)
	{
		if(amount!=0)
		{
			balence = balence + amount;
			lastTransaction = amount;
		}
	}
	void Withdraw(int amount)
	{
		if(amount!=0)
		{
			balence = balence - amount;
			lastTransaction = -amount;
		}
	}
	void getPreviousTransaction()
	{
		if(lastTransaction > 0 )
		{
			System.out.println("Deposited : "+lastTransaction);
		}
		else if(lastTransaction < 0 )
		{
			System.out.println("Withdraw : "+Math.abs(lastTransaction));
		}
		else
		{
			System.out.println("No Transactions");
		}
	}
	void Menu()
	{
		char option = '\0';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WELCOME"+CustmorName);
		System.out.println("WELCOME"+CustomerID);
		System.out.println("\n");
		System.out.println("A. Check Balence");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. lastTransaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("====================================================");
			System.out.println("Enter your option");
			System.out.println("====================================================");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A' : System.out.println("---------------------------------");
			           System.out.println("Balence"+balence);
			           System.out.println("---------------------------------");
			           System.out.println("\n");
			           break;
			case 'B' : System.out.println("---------------------------------");
			           System.out.println("Enter an amount to deposit");
			           System.out.println("---------------------------------");
			           int amount1 = sc.nextInt();
			           deposit(amount1);
			           System.out.println("\n");
			           break;
			case 'C' : System.out.println("---------------------------------");
			           System.out.println("Enter an amount to Window");
			           System.out.println("---------------------------------");
			           int amount2 = sc.nextInt();
			           withdraw(amount2);
			           System.out.println("\n");
			           break;  
			case 'D' : System.out.println("---------------------------------");
			           getPreviousTransaction();
			           System.out.println("---------------------------------");
			           System.out.println("\n");
			           break;  

			case 'E' : System.out.println("---------------------------------");
			           break;
			}
		}
		while(option!= 'E');
		System.out.println("thank you");
	}
}