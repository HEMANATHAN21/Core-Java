package INHERITANCE;

class This
{
	This()
	{
		this(10);
		System.out.println("I am in This().........");
	}

	This(int x)
	{
		this(10.5);
		System.out.println("I am in This(int x).........");
	}

	This(double y)
	{
		System.out.println("I am in This(double y).........");
	}
}
public class this_statement  {

	public static void main(String[] args) {
		This t1 = new This();

	}

}
