package ExtraContentsJava;

interface Demo1
{
	void m1();
}

interface Demo2
{
	void m2(int x);
}
public class LamdaExpressionEx 
{

	public static void main(String[] args) 
	{

		Demo1 d1 = () -> //( -> is lamda expression)
		{
			System.out.println("Iam in lamda Expression m1()...");
			
		};
		d1.m1();
		
		Demo2 d2 = (a) ->
		{
			System.out.println("Iam in lamda Expression m2()...");
		};
		d2.m2(10);

	}

}
