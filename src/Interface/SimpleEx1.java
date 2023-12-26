package Interface;


interface A
{
	int x = 10;
	
	void Display1();
	void Display2();
}

class B implements A
{
	public void Display1()
	{
		System.out.println("Iam in Overrided Method Display1!!");
	}
	public void Display2()
	{
		System.out.println("Iam in Overrided Method Display2!!");
	}
}
public class SimpleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("X value Is : "+A.x);
		//A a1 = new A();//We can't create object for interface
		A a1 = new B();//upcasting
		a1.Display1();
		a1.Display2();
	}

}
