import java.util.Scanner;
class Appa
{
	Scanner sc = new Scanner(System.in);
	int rear = -1;
	int front = 0;
	int item,i;
	int size = 5;
	int q[] = new int[5];
	void insert()
	{
		if(rear==size-1)
		{
			System.out.println("Queue is full - Cant insert");
		}
		else
		{
			System.out.println("insert elements into a queue");
			item = sc.nextInt();
			++rear;
			q[rear] = item;
		}
	}
	void delete()
	{
		if(front>rear)
		{
			System.out.println("Queue is empty cant delete anythingX");
		}
	}
}
class Queuess
{

}
