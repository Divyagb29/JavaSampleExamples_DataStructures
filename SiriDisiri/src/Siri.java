import java.io.*;
class Employee implements Serializable
{
	transient String name;
	int age;
	float salry;
	Employee(String name,int age,float salry)
	{
		this.name = name;
		this.age = age;
		this.salry = salry;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(salry);
	}
}
class Seri
{
	public static void main(String ag[])throws IOException
	{
		Employee c = new Employee("aishi",23,8000.0f);
		String path = "C:\\Users\\Divya\\Desktop\\series1.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
	}
}
