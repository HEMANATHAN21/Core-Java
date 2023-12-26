package ExtraContentsJava;

public class RunnableInterfaceLamdaExpressionUsing 
{

	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() //AnonymousClass
		{
			@Override
			public void run() 
			{
				System.out.println("I am in AnonymousClass run()...");
				
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		System.out.println("---------------------------------------");
		System.out.println("\t Using Lamda Expression");
		
		Runnable r2 = () -> System.out.println("I am in lamda expression run()...");
		Thread t2 = new Thread(r2);
		t2.start();
		
		System.out.println("------------------------------");
		Thread t3 = new Thread(() -> System.out.println("I am in lamda expression 2..."));
		t3.start();

	}

}
