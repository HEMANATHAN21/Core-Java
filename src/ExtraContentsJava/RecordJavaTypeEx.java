package ExtraContentsJava;


record Student(int id,String name)
{
	
}
public class RecordJavaTypeEx {

	public static void main(String[] args) 
	{
		Student std1 = new Student(123,"solo");
		System.out.println(std1.name());
	}

}
