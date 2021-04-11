class Queue123
{
	boolean value_insert = false;
	int x;
	synchronized void put(int j)
	{
		try
		{
			if(value_insert == false)
			{
                x=j;				
				System.out.println("i have put "+j+" to Queue");
				value_insert = true;
				notify();
			}
			else
			{
				wait();
			}
		}
		catch(Exception e)
		{
			System.out.println("problem solved");
		}
	}
	synchronized void get()
	{
		try
		{
			if(value_insert == true)
			{
				System.out.println("i have taken "+x+" from queue");
				value_insert = true;
				notify();
			}
			else
			{
				wait();
			}
		}
		catch(Exception e)
		{
			System.out.println("problem solved");
		}
	}
}
class Producer1 extends Thread
{
	Queue r1;
	Producer1(Queue q)
	{
		r1 = q;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			r1.put(i++);
		}
	}
}
class Consumer1 extends Thread
{
	Queue r2;
	Consumer1(Queue q)
	{
		r2=q;
	}
	public void run()
	{
		while(true)
		{
			r2.get();
		}
	}
}
class ProducerConsumer
{
	public static void main(String ag[])
	{
	    Queue q = new Queue();
	    new Producer1(q).start();
	    new Consumer1(q).start();
	}
}
