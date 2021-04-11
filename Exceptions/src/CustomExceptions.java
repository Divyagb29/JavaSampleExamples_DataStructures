import java.util.Scanner;
class Atm
{
	int acc_no = 1234;
	int pwd = 4321;
	void input()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the account number : ");
    acc_no = sc.nextInt();
    System.out.println("enter the psw : ");
    pwd = sc.nextInt();
	}
	void verify()
	{
		if(acc_no==1234 && pwd==4321)
		{
			 System.out.println("plese collect the cash");
		}
		else
		{
			 System.out.println("u r an invalid customer");
		}
	}
}
class Bank
{
	void initiate()
	{
		Atm a = new Atm();
		a.input();
		a.verify();
	}
}
class CustomExceptions 
{
public static void main(String ag[])
{
	Bank b = new Bank();
	b.initiate();
}
}
