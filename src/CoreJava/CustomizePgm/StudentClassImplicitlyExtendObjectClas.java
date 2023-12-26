package CoreJava.CustomizePgm;

public class StudentClassImplicitlyExtendObjectClas implements Cloneable
{
	int id;
	String name;
	long contact;
	
	public StudentClassImplicitlyExtendObjectClas(int id, String name, long contact) 
	{
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	public String toString()
	{
		return "Student Id : "+id+", Student Name : "+name+", Contact Number : "+contact+"";
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o1)
	{
		if(this.hashCode() == o1.hashCode())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public StudentClassImplicitlyExtendObjectClas getclonemethod()
	{
		StudentClassImplicitlyExtendObjectClas ref = null;
		try
		{
			ref = (StudentClassImplicitlyExtendObjectClas) this.clone();
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return ref;
	}
	
	public void finalize()
	{
		System.out.println("finalize() Is Called");
	}
	
	
}
