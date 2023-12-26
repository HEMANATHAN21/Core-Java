package ExtraContentsJava;

interface FirstInterface
{
	boolean greatest(int a, int b);
}

interface SecondInterface
{
	void m1();
}

public class FindgreaterNoUsingLamdaExpression 
{

	public static void main(String[] args) 
	{
		FirstInterface fi = (a,b) -> a>b ;
		System.out.println(fi.greatest(10, 20));
		
		SecondInterface si = () -> System.out.println("I am in secondInterface m1().....");
		si.m1();

	}

}
