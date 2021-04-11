import java.util.Scanner;
class Calsi
{
	int a,b,c1,c2,c3,c4;
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = scan.nextInt();
		System.out.println("Enter the value of b : ");
		int b = scan.nextInt();		
	}
	void calcualte()
	{
		 c1 = a+b;
	}
	void display()
	{
		System.out.println(c1);
	}
}
class Calsi1 extends Calsi
{
	void calcualte()
	{
		 c2 = a-b;
	}
	void display()
	{
		System.out.println(c2);
	}
}
class Calsi2 extends Calsi
{
	void calcualte()
	{
		 c3 = a*b;
	}
	void display()
	{
		System.out.println(c3);
	}
}
class Calsi3 extends Calsi
{
	void calcualte()
	{
		 c4 = a/b;
	}
	void display()
	{
		System.out.println(c4);
	}
}
class Version1exp4
{
public static void main(String ag[])
{
	for(;;)
	{
	Calsi s1 = new Calsi();
	Calsi s2 = new Calsi();
	Calsi s3 = new Calsi();
	
	Calsi ref;
	ref=s1;
	ref.input();
	((Calsi)(ref)).calcualte();
	((Calsi)(ref)).display();
	
	ref=s2;
	ref.input();
	((Calsi)(ref)).calcualte();
	((Calsi)(ref)).display();
	
	ref=s3;
	ref.input();
	((Calsi)(ref)).calcualte();
	((Calsi)(ref)).display();
	
	
	
	/*s1.input();
	s1.calcualte();
	s1.display();
	
	s2.input();
	s2.calcualte();
	s2.display();
	
	s3.input();
	s3.calcualte();
	s3.display();*/
	
	
	/*Calsi ref;
	ref =s1;
	ref.input();
	ref.calcualte();
	ref.display();
	
	ref = s2;
	ref.input();
	ref.calcualte();
	ref.display();
	
	ref = s3;
	ref.input();
	ref.calcualte();
	ref.display(); */
	
	}
}
}
