import java.util.ArrayList;
class CollectionAllMethods
{
public static void main(String ag[])
{
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);//add method
	al.add(40);
	al.add(50);
	al.add(5,60);//adding extra element to an array list
	al.add(30);
	System.out.println(al);
	System.out.println(al.contains(50));//it gives the output like true or false,means it checks the value is present or not
	System.out.println(al.contains(80));
	System.out.println(al.getClass());//it gives the class name --class java.util.ArrayList
	System.out.println(al.get(4));
	System.out.println(al.size());
	al.ensureCapacity(10);
	System.out.println(al);
	System.out.println(al.lastIndexOf(30));
	System.out.println(al.subList(0, 4));
	System.out.println(al.isEmpty());
	System.out.println(al.remove(6));
	System.out.println(al);
    
	ArrayList a = new ArrayList();
	a.add(70);
	a.add(30);
	a.add(40);
	a.add(100);
	System.out.println(a);
	al.addAll(a);
	System.out.println(al);
	al.set(8, 101);
	System.out.println(al);
	al.retainAll(a);
	System.out.println(al);
}
}
