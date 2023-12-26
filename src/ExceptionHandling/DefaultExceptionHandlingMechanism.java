package ExceptionHandling;

public class DefaultExceptionHandlingMechanism {

	public static void main(String[] args) 
	{
		System.out.println("----------------------------");
		method1();
		System.out.println("----------------------------");
	}

	private static void method1() 
	{
		method2();
	}

	private static void method2() 
	{
		System.out.println(10/0);
	}

}
