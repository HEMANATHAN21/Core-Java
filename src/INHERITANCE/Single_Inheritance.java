package INHERITANCE;

class A
{
	int x=10;
}

class B extends A
{
	int y=20;
}
public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		System.out.println("X value Is : "+b1.x);
		System.out.println("Y value Is : "+b1.y);

	}

}
