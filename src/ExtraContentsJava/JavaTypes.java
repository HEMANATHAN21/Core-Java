package ExtraContentsJava;

import java.time.DayOfWeek;

//enum
enum Days
{
	MON,TUE,WED,THU,FRI,SAT,SUN;
}

//annotations
@interface MyAnnotation
{
	
}

class A
{
	void test()
	{
		System.out.println("I am In Test method...");
	}
}
@MyAnnotation
class B extends A
{
	@Override
	void test()
	{
		System.out.println("I am In Test method in Class B...");
	}
}

//record

record Employee(int id, String name, double salary) 
{
	
}


public class JavaTypes 
{

	public static void main(String[] args) 
	{
		System.out.println("Today Day Is : "+Days.TUE);
		System.out.println(DayOfWeek.TUESDAY);
		Employee emp1 = new Employee(123,"solo",10000);
		System.out.println(emp1.id());
	}
		
		

}

