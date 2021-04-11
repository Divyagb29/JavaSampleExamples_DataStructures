
class Revrese
{
	public static void main(String ag[])
	{
		String s = "Dakshayani";
		char c[] = s.toCharArray();
		int size = s.length();
		char d[] = new char[size];
		int i = 0;
		while(i!=size)
		{
			d[size-1-i] = c[i];
		}
		System.out.println(s);
		System.out.println(d[size]);
	}
}
