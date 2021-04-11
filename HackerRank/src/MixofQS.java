import java.util.*;
class stacks
{
	int element,i,size=5,top=-1;
	Scanner sc = new Scanner(System.in);
	int s[] = new int[5];
	void push()
	{
		if(top==size-1)
		{
			System.out.println("stack is full - can't push anything ");
		}
		else
		{
			System.out.println("push elements into stack : ");
			element = sc.nextInt();
	        ++top;
	        s[top]=element;
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty - can't pop anything ");
		}
		else
		{
			System.out.println("pop elements from stack : "+s[top]);
	        --top;
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("stack is empty - can't display anything ");
		}
		else
		{
			for(i=0;i<=top;i++)
			{
				System.out.println("Displaying the elements in stack "+ s[i]);
			}
		}
	}
}
class Queues
{
	int i,element,size=5;
	int rear;
	int front = 0;
	Scanner sc = new Scanner(System.in);
	int s[] = new int[5];
	void insert()
	{
		if(rear ==size-1)
		{
			System.out.println("queue is full - can't insert anything ");
		}
		else
		{
			System.out.println("enter the elements into the queue : ");
			element = sc.nextInt();
			++rear;
			s[rear]=element;
		}
	}
	void delete()
	{
		if(front>rear)
		{
			System.out.println("queue is empty - can't delete anything ");
		}
		else
		{
			System.out.println("Deleting the elements from the queue : "+s[front]);
			++front;
		}
	}
	void display()
	{
		if(front>rear)
		{
			System.out.println("queue is empty - can't display anything ");
		}
		else
		{
			for(i=front;i<=rear;i++)
			{
				System.out.println("elements in the queue are "+s[i]);
			}
		}
	}
}
class MixofQS
{
	public static void main(String ag[])
	{
		Scanner sc = new Scanner(System.in);
		stacks st = new stacks();
		Queues qs = new Queues();
	
			System.out.println(" press 1 to go for Stack : ");
			System.out.println(" press 2 to go for Queue : ");
	        int que = sc.nextInt();
		
			while(true)
			{
				System.out.println("press 1 to push the element ");
				System.out.println("press 2 to pop the element ");
				System.out.println("press 3 to display the element ");
				System.out.println("press 4 to exit");
				int store = sc.nextInt();
				
				switch(que)
				{
				case 1:st.push();
				       break;
				case 2:st.pop();
				       break;
				case 3:st.display();
				       break;
				case 4:System.out.println("Thank You");
				       System.exit(-1);
				}
				switch(queue2)
				{
				case 1:qs.insert();
				       break;
				case 2:qs.delete();
				       break;
				case 3:qs.display();
				       break;
				case 4:System.out.println("Thank You");
				       System.exit(-1);
				}
			}
		}

	}

