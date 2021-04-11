import java.util.*;
class PalindromeString 
{
	public static void main(String ag[])
	{
		String str,reverse="";
		int length,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
	    str =sc.nextLine();
		length = str.length();
		for(i=length-1;i>=0;i--)
			reverse=reverse+str.charAt(i);
		if(str.equals(reverse))
		{
			System.out.println(" palindrome ");
		}
		else
		{
			System.out.println("not palindrome ");
		}
	}
}
