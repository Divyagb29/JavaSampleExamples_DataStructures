import java.util.Scanner;
class Farmer123
{
	int p,t,si;
	static int r = 20;
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the principle amount : ");
		p = scan.nextInt();
		System.out.println("enter the duration : ");
		t = scan.nextInt();	
	}
	void calc()
	{
		 si = (p*t*r)/100;
	}
	void display()
	{
		System.out.println(si);
	}
}
 class Farmer
{
public static void main(String ag[])
{
		
	Farmer123 f = new Farmer123();
	for(int i=1;;i++)
	{
		System.out.println("Farmer " + i);	
		f.input();
		f.calc();
		f.display();
		
	}
	}
}

