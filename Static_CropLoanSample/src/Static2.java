class Bujji
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
class Static2 
{
public static void main(String ag[])
{
	Bujji a=new Bujji();
	Bujji a1=new Bujji();
	Bujji a2=new Bujji();
	
	a.compute1();
	a.compute2();
	a.compute3();
	a.compute4();
	a.display();
	
	a1.compute1();
	a1.compute2();
	a1.compute3();
	a1.compute4();
	a1.display();
	
	a2.compute1();
	a2.compute2();
	a2.compute3();
	a2.compute4();
	a2.display();
}
}
