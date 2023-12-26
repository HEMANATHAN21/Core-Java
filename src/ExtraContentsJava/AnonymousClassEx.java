package ExtraContentsJava;


interface Demo
{
	void m1();
}
public class AnonymousClassEx 
{

	public static void main(String[] args) 
	{
		Demo d1 = new Demo()
				{

					@Override
					public void m1() 
					{
						System.out.println("AnonymousClass m1()...");
						
					}
			
				};
				d1.m1();
	}

}
