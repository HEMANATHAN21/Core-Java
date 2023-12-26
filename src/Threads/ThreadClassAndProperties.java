package Threads;

class MyThread extends Thread
{
	public void run()
	{
		Thread t1 = Thread.currentThread();
		for(int i=1;i<=100;i++)
		{
			System.out.println(t1.getName());
		}
	}
}

public class ThreadClassAndProperties 
{

	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		MyThread mt1 = new MyThread();
		mt1.setName("child");
		mt1.setPriority(1);
		mt1.start();
		for(int i=1;i<=100;i++)
		{
			System.out.println("parent : "+t1.getName());
		}

	}

}
