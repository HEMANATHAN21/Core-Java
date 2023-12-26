package ENCAPSULATION;

public class SampDummy {
	static public  void main(String[] args) {
		A a1 = new B();
		
		B b1= (B) a1;
		
		//A a2=new A();
		b1.Display();
		
	}

}
class A
{
	void Display()
	{
		System.out.println("Iam in A class");
	}
	
}

class B extends A
{
	final void Display()
	{
		 System.out.println("Iam in B class");
	}
}