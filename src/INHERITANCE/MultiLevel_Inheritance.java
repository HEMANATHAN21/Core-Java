package INHERITANCE;

class A1
{
	int x=10;
}

class B1 extends A1
{
	int y=20;
}

class C1 extends B1
{
	int z=30;
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c1 = new C1();
		System.out.println("X value Is : "+c1.x);
		System.out.println("Y value Is : "+c1.y);
		System.out.println("Z value Is : "+c1.z);
	}

}
