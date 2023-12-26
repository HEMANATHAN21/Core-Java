package FileHandling;
import java.io.*;
public class ShowFilesInSpecificPath 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling");
		String[] names = f1.list();
		for(String name : names)
		{
			if(name.endsWith(".java"))
			{
				System.out.println(name);
			}
		}
	}

}
