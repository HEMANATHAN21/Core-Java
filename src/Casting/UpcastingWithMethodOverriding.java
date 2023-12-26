package Casting;


class A
{
	void wish()
	{
		System.out.println("Hi...");
	}
}

class B extends A
{
	void wish()
	{
		System.out.println("Hiiiii...");
	}
}
public class UpcastingWithMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A();
		a1.wish();
		
		B b1 = new B();
		b1.wish();
		
		A a11 = b1;//upcasting
		a11.wish();

	}

}
