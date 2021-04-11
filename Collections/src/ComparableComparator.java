import java.util.*;
import java.lang.*;
class Cricketer 
{
	String name;
	int runs;
	float avg;
	Cricketer(String name,int runs,float avg)
	{
		this.name = name;
		this.runs = runs;
		this.avg = avg;
	}
	public String toString()
	{
		return name+" "+runs+" "+avg;
	}
}
class Alpha1 implements Comparator
{
	public int Compare(Object x,Object y)
	{
		if(((Cricketer)(x)).runs >((Cricketer)(y)).runs)
		{
			return 1;
		}
		else
			return - 1;
	}
	
}
class Alpha2 implements Comparator
{
	public int Compare(Object x,Object y)
	{
		if(((Cricketer)(x)).runs >((Cricketer)(y)).runs)
		{
			return 1;
		}
		else
			return - 1;
	}
}
class ComparableComparator
{
	public static void main(String ag[])
	{
		Alpha1 a1 = new Alpha1();
		Alpha2 a2 = new Alpha2();
		Cricketer c1 = new Cricketer("yuvi",500,50.0f);
		Cricketer c2 = new Cricketer("dhoni",700,70.0f);
		Cricketer c3 = new Cricketer("kapil",200,20.0f);
		
		ArrayList al = new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Collections.sort(al.a1);
		System.out.println(al);
		Collections.sort(al.a2);
		System.out.println(al);
	}
}
