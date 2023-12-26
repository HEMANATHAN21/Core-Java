package Abstraction;


abstract class A
{
	abstract void Add(int a,int b);
	abstract void Sub(int a,int b);
}

class B extends A
{
	void Add(int a,int b)
	{
		int c = a+b;
		System.out.println("Addition Of Two Numbers Is : "+c);
	}
	void Sub(int a,int b)
	{
		int c = a-b;
		System.out.println("Subtraction Of Two Numbers Is : "+c);
	}
}
public class AbstractionEx1 {
	public static void main(String[] args) {
		//A a1 = new A();//We can't Create object for abstract class
		A a1 = new B();
		a1.Add(10, 20);
		a1.Sub(100, 50);
	}
}
