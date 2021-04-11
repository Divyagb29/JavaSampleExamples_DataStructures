import java.util.Scanner;
class Steem
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
class Queen
{
	int i,element,size=5;
	int rear=-1;
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
class mixQS2
{
	public static void main(String ag[])
	{
		Scanner sc = new Scanner(System.in);
		Steem sm = new Steem();
		Queen qn = new Queen();
		
		
	        while(true)
	        {
	        	System.out.println("press 1 to go for Stack : ");
		     	System.out.println("press 2 to go for Queue : ");
	            int sta = sc.nextInt();                   
					  if(sta==1)
				       { 	
						    System.out.println("press 1 to push the element ");
							System.out.println("press 2 to pop the element ");
							System.out.println("press 3 to display the element ");
							System.out.println("press 4 to exit");
							int choice = sc.nextInt();
							if(choice ==1)
							{
								sm.push();
							}
							if(choice == 2)
							{
								sm.pop();
							}
							if(choice == 3)
							{
								sm.display();
							}
							if(choice == 4)
							{
								System.out.println("THANK YOU");
								
							}
						}
				
					if(sta==2)
					{
						System.out.println("press 1 to push the element ");
						System.out.println("press 2 to pop the element ");
						System.out.println("press 3 to display the element ");
						System.out.println("press 4 to exit");
						int choice = sc.nextInt();
						if(choice ==1)
						{
							qn.insert();
						}
						if(choice == 2)
						{
							qn.delete();
						}
						if(choice == 3)
						{
							qn.display();
						}
						if(choice == 4)
						{
							System.out.println("THANK YOU");	
						}
					}
			    }
		   }
	  }

