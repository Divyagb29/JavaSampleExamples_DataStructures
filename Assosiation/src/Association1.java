class Bank
{
	String name;
	Bank(String name)
	{
		this.name = name;
	}
	String getname()
	{
		return name;
	}
}
class Employee
{
	String name;
	Employee(String name)
	{
		this.name = name;
	}
	String getname123()
	{
		return name;
	}
}
class Association1
{
public static void main(String ag[])
{
	Bank b = new Bank("Standerd Charted");
	Employee e = new Employee("Divya");
	System.out.println(e.getname123() + " is working in the bank " + b.getname());
}
}
