package FileHandling;
import java.io.*;
public class FolderCreationEx 
{

	public static void main(String[] args) 
	{
		File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling");
		if(f1.exists())
		{
			System.out.println("Deleting Old Folder And Creating New One...");
			f1.delete();
			f1.mkdir();
		}
		else
		{
			System.out.println("Creating New Folder..");
			f1.mkdir();
		}

	}

}
