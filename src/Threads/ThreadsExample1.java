package Threads;

class Hero extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I Value Is : "+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class Demon implements Runnable
{
	public void run()
	{
		for(int j=100;j<=110;j++)
		{
			System.out.println("J Value Is : "+j);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
public class ThreadsExample1 
{

	public static void main(String[] args) 
	{
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		
		h1.start();
		h2.start();
		
		Demon d1 = new Demon();
		Demon d2 = new Demon();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t2.start();
	}

}
