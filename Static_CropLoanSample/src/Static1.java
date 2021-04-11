class Abc
{
	int a=22,b=30,c;
	int c1,c2,c3,c4;
    void compute1()
    {
    	c1=a+b;
    }
    void compute2()
    {
    	c2=a-b;
    }
    void compute3()
    {
    	c3=a*b;
    }
    void compute4()
    {
    	c4=a/b;
    }
    void display()
    {
    	System.out.println(c1);
    	System.out.println(c2);
    	System.out.println(c3);
    	System.out.println(c4);
    }
}
class Static1 
{
public static void main(String ag[])
{
	Abc a=new Abc();
	a.compute1();
	a.compute2();
	a.compute3();
	a.compute4();
	a.display();
}
}
