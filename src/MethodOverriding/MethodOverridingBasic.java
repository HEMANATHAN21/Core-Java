package MethodOverriding;

 class classA
{
	private void display()
	{
		System.out.println("Iam in class A");
	}
}
class classB extends classA
{
	void display()
	{
		System.out.println("Iam in class B");
	}
}

public class MethodOverridingBasic {

	public static void main(String[] args) {
		classB cb = new classB();
		cb.display();

	}

}
