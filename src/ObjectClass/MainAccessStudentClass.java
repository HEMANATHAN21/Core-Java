package ObjectClass;
import CoreJava.CustomizePgm.StudentClassImplicitlyExtendObjectClas;
public class MainAccessStudentClass 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentClassImplicitlyExtendObjectClas std1 = new StudentClassImplicitlyExtendObjectClas(123,"HEMANATHAN",638393467);
		StudentClassImplicitlyExtendObjectClas std2 = new StudentClassImplicitlyExtendObjectClas(456,"JEYAVARSHAN",638393423);
		StudentClassImplicitlyExtendObjectClas std3 = new StudentClassImplicitlyExtendObjectClas(123,"HEMANATHAN",638393467);
		
		//EXPLICIT CALL toString()
		String s1 = std1.toString();
		System.out.println(s1);
		System.out.println(std2.toString());
		
		//IMPLICIT CALL toString()
		System.out.println(std1);
		System.out.println(new StudentClassImplicitlyExtendObjectClas(111,"solo",63867));
		
		//hashCode() //DONE ONLY EXPLICITLY
		int h1 = std1.hashCode();
		System.out.println(h1);
		System.out.println(std2.hashCode());
		
		//equals() //DONE ONLY EXPLICITLY
		boolean e1 = std1.equals(std2);
		System.out.println(e1);
		System.out.println(std1.equals(std3));
		
	
	
	}

}
