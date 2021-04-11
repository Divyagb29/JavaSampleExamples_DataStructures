class Divya extends Object
{
	private int roll_num;
	private String name;
	Divya()
	{
		roll_num = 123456;
		name = "darshan";
	}
	void print()
	{
		System.out.println(roll_num);
		System.out.println(name);	
	}
}
class Divya1 extends Divya
{
	Divya1()
	{
		roll_num = 576687;  //private members cannot accessed
		name = "gsfhjhjhj";
	}
	void print1()
	{
		System.out.println(roll_num);
		System.out.println(name);	
	}
}

class Rule1 
{
public static void main(String ag[])
{
	Divya1 d = new Divya1();
	d.print();
	d.print1();
}
}
