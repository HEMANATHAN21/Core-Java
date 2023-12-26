package INHERITANCE;

class parrent1
{
	int x=10;
	
}
class child1 extends parrent1
{
	int y=20;
}
class child2 extends parrent1
{
	int z=30;
}
public class Hirarichal_Inheritance {

	public static void main(String[] args) {
		child1 ch1 = new child1();
		
		System.out.println("x value is "+ch1.x);
		System.out.println("y value is "+ch1.y);
		
		child2 ch2 = new child2();
		
		System.out.println("x value is "+ch2.x);
		System.out.println("z value is "+ch2.z);
		
	}

}
