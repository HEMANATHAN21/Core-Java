package ObjectClass;

import CoreJava.CustomizePgm.StudentClassImplicitlyExtendObjectClas;

public class cloneAndFinalizeAndGet {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClassImplicitlyExtendObjectClas std1 = new StudentClassImplicitlyExtendObjectClas(123,"solohema",123456);
		StudentClassImplicitlyExtendObjectClas std2 = std1.getclonemethod();//call the clone method
		
		System.out.println(std1);
		System.out.println(std2);
		
		std1=null;
		//std1=null;
		System.gc();//call finalize method
		//System.out.println(std1);
		//System.out.println(std2);
		
		Class c1 = std2.getClass();//call get method
		System.out.println(c1);
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getPackageName());
	}

}
