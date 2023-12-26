package INHERITANCE;

class No1Class
{
	int x = 10;
}

class No2Class extends No1Class
{
	int x = 100;
	void display()
	{
		int x = 1000;
		System.out.println("Local X value is : "+x);
		System.out.println("current class X value is : "+this.x);
		System.out.println("super class X value is : "+super.x);
	}
}

public class this_And_super_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No2Class N2 = new No2Class();
		N2.display();
	}

}
