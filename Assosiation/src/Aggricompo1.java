class Heart
{
	String parts;
	Heart(String parts)
	{
		this.parts = parts;
	}
	String getHeart()
	{
		return parts;
	}
}
class Brain
{
	String name;
	Brain(String name)
	{
		this.name = name;
	}
	String getBrain()
	{
		return name;
	}
}
class Bike
{
	String name;
	Bike(String name)
	{
		this.name = name;
	}
	String getBike()
	{
		return name;
	}
}
class Books
{
	String author;
	Books(String author)
	{
		this.author = author;
	}
	String getBooks()
	{
		return author;
	}
}
class Divya
{
	Heart h = new Heart("vains");
	Brain b = new Brain("memory of body");
	void hasa(Bike b)
	{
		System.out.println(b.getBike());
	}
	void hasa(Books s)
	{
		System.out.println(s.getBooks());
	}
}
 class Aggricompo1
{
public static void main(String ag[])
{
	Divya d = new Divya();
	Bike b = new Bike("Bullet");
	Books s = new Books("James gosling");
	
	System.out.println(d.h.getHeart());
	System.out.println(d.b.getBrain());
	
	d.hasa(b);
	d.hasa(s);
	
}
}
