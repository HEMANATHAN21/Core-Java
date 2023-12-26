package Casting;


class UpDowncast
{
	void Usinginstanceof(AA a1)
	{
		if(a1 instanceof CC)
		{
			CC c1=(CC)a1;//downcasting
			System.out.println(c1.x);
			System.out.println(c1.y);
			System.out.println(c1.z);
		}
		else if(a1 instanceof BB)
		{
			BB b1=(BB)a1;
			System.out.println(b1.x);
			System.out.println(b1.y);
		}
		else
		{
			System.out.println(a1.x);
			
		}
	}
}
public class UpDownCastingWithInstanceofKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UpDowncast ud = new UpDowncast();
		
		ud.Usinginstanceof(new CC());
		ud.Usinginstanceof(new BB());
		ud.Usinginstanceof(new AA());
	}

}
