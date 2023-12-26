package FileHandling;
import java.io.*;
public class FilesCreation 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling\\data.txt");
		//File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling\\data.doc");
		File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling\\data.xlsx");
		
		try {
			f1.createNewFile();
			
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(f1.canExecute());
			
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getName());
			System.out.println(f1.setWritable(false));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
