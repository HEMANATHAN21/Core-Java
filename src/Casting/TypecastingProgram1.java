package Casting;

public class TypecastingProgram1 {

	public static void main(String[] args) {
		byte a = 10;
		//byte b = 20;
		//int x = a+b;
		
		//int x = (int)a;//Explicit widening
		//int x= a;//Implicit widening
		//System.out.println(x);
		//char ch='A';
		//int x=ch;
		
		double b=22.22;
		int x=(int)b;//Explicit Narrowing
		System.out.println(x);
	}

}
