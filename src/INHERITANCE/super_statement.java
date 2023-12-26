package INHERITANCE;

class A11
{
	A11(int x)
	{
		System.out.println("class A in A(int x)..........");
	}
}

class B11 extends A11
{
	B11(double y)
	{
		super(10);
		System.out.println("class B in B(double y)..........");
	}
}

class C11 extends B11
{
	C11()
	{
		super(10.11);
		System.out.println("class C in C()..........");
	}
}
public class super_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C11 c1 = new C11();

	}

}
