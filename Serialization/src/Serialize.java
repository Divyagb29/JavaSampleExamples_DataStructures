import java.io.*;
class Cricket implements Serializable
{
	String name;
	int age;
	float salry;
	Cricket(String name,int age,float salry)
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
class Serialize
{
	public static void main(String ag[])throws IOException
	{
		Cricket c = new Cricket("divya",23,8000.0f);
		String path = "C:\\Users\\Divya\\Desktop\\series.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		
	}
}
