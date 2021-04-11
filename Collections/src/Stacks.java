import java.util.Scanner;
class Ammu
{
	Scanner sc = new Scanner(System.in);
	int top=-1;
	int size = 5;
	int s[] = new int[5];
	void push()
	{
		if(top==size-1)
		{
			System.out.println("Stack is full - cant insert anything into stack");
		}
		else
		{
			System.out.println("enter the elements to be insert");
			int ele = sc.nextInt();
			++top;
			s[top]=ele;
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty  - cant delete anything");
		}
		else
		{
			System.out.println("the element deleted is :"+s[top]);
			--top;
		}
	}
	void display()
	{
		if(top==1)
		{
			System.out.println("stack is empty  - cant display anything");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.println("the elements in the stack are :"+s[i]);
			}
		}
	}
}
class Stacks
{
	public static void main(String ag[])
	{
		Scanner sc = new Scanner(System.in);
		Ammu d = new Ammu();
		int choice;
		while(true)
		{
			System.out.println("press 1 to push the element  into stack");
			System.out.println("press 2 to pop the element from stack");
			System.out.println("press 3 to display the element in stack");
			System.out.println("press 4 to exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:d.push();
			break;
			case 2:d.pop();
			break;
			case 3:d.display();
			break;
			case 4:System.out.println("thank you");
			System.exit(-1);
			}
		}
	}
}