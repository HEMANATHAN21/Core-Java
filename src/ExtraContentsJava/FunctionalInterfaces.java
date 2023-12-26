package ExtraContentsJava;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces 
{

	public static void main(String[] args)
	{
		
		//Predicate
		Predicate<Integer> p1 = (a) -> a>0;
		System.out.println(p1.test(10));
		
		Predicate<String> p2 = (a) -> a.length()>0;
		System.out.println(p2.test("solo"));
		
		//Consumer
		Consumer<Integer> c1 = (a) -> System.out.println(a*10+10);
		c1.accept(10);
		
		Consumer<Integer> c2 = (a) -> 
		{
			System.out.println(a*a);
			System.out.println(a*a*a);
		};
		c2.accept(10);
		
		//Function
		Function<Integer, Integer> f1 = (a) -> a*a;
		System.out.println(f1.apply(10));
		
		Function<String, String> f2 = (a) -> a+"_JSpider";
		System.out.println(f2.apply("QSpider"));
		

	}

}
