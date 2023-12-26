package Casting;

class AAA
{
	int x=10;
}
class BBB extends AAA
{
	int y=20;
}
class CCC extends BBB
{
	int z=30;
}

public class DownCasting_RefOb {

	public static void main(String[] args) {
		//BBB b1 = (BBB) new AAA();//Not Possible ClassCastException
		
		CCC c1=new CCC();
		
		AAA a1=(AAA)c1;//upcasting
		System.out.println(a1.x);
		//System.out.println(a1.y);//if we are creating object for AAA class only access that class data member
		
		BBB b1=(BBB)a1;
		System.out.println(b1.x);
		System.out.println(b1.y);
		
		CCC c11=(CCC)b1;
		System.out.println(c11.x);
		System.out.println(c11.y);
		System.out.println(c11.z);
	}

}
