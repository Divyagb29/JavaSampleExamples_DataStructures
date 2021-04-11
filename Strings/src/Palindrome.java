import java.util.*;
class Palindrome 
{
	public static void main(String ag[])
	{
		Scanner sc = new Scanner(System.in);
		int temp,sum=0,r;
		System.out.println("enter the String to get palindrome : ");
		int n = sc.nextInt();
		temp = n;
	        while(n>0)
	        {
		        r = n%10;
			    sum = (sum*10)+r;
			    n =n/10;
	        }
		    if(temp==sum)
		    	System.out.println("it is an palindrome");
		    else
		    	System.out.println("it is not palindrome");
	    }
	    
	}

