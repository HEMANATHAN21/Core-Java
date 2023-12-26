package INHERITANCE;

class Thiss
{
	Thiss()
	{
		System.out.println("I am in Thiss()...");
	}
	Thiss(int x)
	{
		this();
		System.out.println("I am in Thiss(int x)...");
	}
}

class Superr extends Thiss
{
	Superr()
	{
		this(10);
		System.out.println("I am in Superr()...");
	}
	Superr(int x)
	{
		super(10);
		System.out.println("I am in Superr(int x)...");
	}
}

public class super_this_Statement 
{
	public static void main(String [] args)
	{
		Superr ST = new Superr();
	}

}
