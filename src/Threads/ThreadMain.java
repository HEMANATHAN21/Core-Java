package Threads;

public class ThreadMain 
{

	//public static void main(String[] args) 
	//public static void main(String... args)//work (...) it should consider as []
	//private static void main(String[] args)//error
	//public  void main(String[] args)//error
	//public static int main(String[] args)//error
	//public static void Main(String[] args)//error
	//public static void main(int[] args)//error
	//final public static void main(String[] args)//works
	//we can't define main method as abstract because it is static
	//static public void main(String[] args)//works
	//we can overload main() method
	//we can't override main() method
	//public static void main(String[] hema)//work
	public static void main(String[] args)
	{
		Thread t1 = Thread.currentThread();
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(args.length);//Here I passed argument in commandline
		//default args size is 0.whenever we are passing argument in commandline based on argument args length should be differ
		System.out.println(args[0] + args[1]);
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println(x + y);
		
	}

}
