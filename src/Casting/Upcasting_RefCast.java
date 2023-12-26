package Casting;

class AA
{
	int x=10;
}
class BB extends AA
{
	int y=20;
}
class CC extends BB
{
	int z=30;
}

public class Upcasting_RefCast {

	public static void main(String[] args) {
		
		CC c1 = new CC();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		
		BB b1 = (BB) c1; //explicit upcasting
		System.out.println(b1.x);
		System.out.println(b1.y);
		
		//AA a1 =  b1; //implicit upcasting
		//System.out.println(a1.x);
		
		AA a1 = (AA) b1; 
		System.out.println(a1.x);
		
		AA a11 = (AA) new CC(); 
		System.out.println(a11.x);
		
		
	}

}
