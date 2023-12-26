package ExtraContentsJava;

@FunctionalInterface
interface Demoo
{
	int add(int a, int b);
}

public class CreateMethodUsingLamdaExpression 
{

	public static void main(String[] args) 
	{
		//Demoo d1 = (a,b) ->{return a+b;};//One Possiblities
		Demoo d1 = (a,b) -> a+b;//Another Possibilities
		System.out.println(d1.add(10, 20));

	}

}
