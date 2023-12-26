package FileHandling;
import java.io.*;
public class ReadAFile
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling\\data.txt");
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(f1);
			int size = (int) f1.length();
			char[] arr = new char[size];
			fr.read(arr);
			String data = new String(arr);
			System.out.println(data);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(fr != null)
			{
				try {
					fr.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}

	}

}
