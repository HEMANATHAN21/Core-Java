package INHERITANCE;

class superclass
{
	int x = 10;
}

class subclass extends superclass
{
	int y = 20;
}

class newsuperclass extends subclass
{
	int z = 30;
}

class newsubclass1 extends newsuperclass
{
	
}

class newsubclass2 extends newsuperclass
{
	
}

public class Hybrid_Inheritance {

	public static void main(String[] args) {
		System.out.println("newsubclass1 inherited by newsuperclass");
		
		newsubclass1 ns1 = new newsubclass1();
		System.out.println("x value is : "+ns1.x);
		System.out.println("x value is : "+ns1.y);
		System.out.println("x value is : "+ns1.z);
		
		System.out.println("newsubclass2 inherited by newsuperclass");
		
		newsubclass2 ns2 = new newsubclass2();
		System.out.println("x value is : "+ns2.x);
		System.out.println("x value is : "+ns2.y);
		System.out.println("x value is : "+ns2.z);

	}

}
