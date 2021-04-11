import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Collections;
class Sortings
{
	public static void main(String ag[])
	{
		ArrayDeque ad = new ArrayDeque();
		ad.add(50);
		ad.add(40);
		ad.add(30);
		ad.add(20);
		ad.add(10);
		System.out.println(ad);
	
		ArrayList al = new ArrayList();
		al.addAll(ad);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		ad.addAll(al);
		System.out.println(ad);
		ad.clear();
		System.out.println(ad);
		ad.addAll(al);
		System.out.println(ad);
	}
}