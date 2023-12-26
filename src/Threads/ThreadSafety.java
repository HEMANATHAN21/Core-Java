package Threads;

class Greeting 
{
	public synchronized static void greet()
	{
		String s1 = "GOOD MORNING";
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println();
	}
}

class GreetThread extends Thread
{
	public void run()
	{
		Greeting.greet();
	}
}
public class ThreadSafety 
{

	public static void main(String[] args) 
	{
		GreetThread gt1 = new GreetThread();
		GreetThread gt2 = new GreetThread();
		GreetThread gt3 = new GreetThread();
		
		gt1.start();
		gt2.start();
		gt3.start();
	}

}
