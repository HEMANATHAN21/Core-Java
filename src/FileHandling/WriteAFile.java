package FileHandling;
import java.io.*;
public class WriteAFile 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling\\data.txt");
		
		FileWriter fw = null;
		
		try 
		{
			f1.setWritable(true);
			fw = new FileWriter(f1);
			fw.write("I am Solo\n");
			fw.write("I am Solo\n");
			fw.write("I am Solo\n");
			fw.write("I am Solo\n");
			
			fw.flush();
			System.out.println("Writing Work done..");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(fw != null)
			{
				try {
					fw.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}

	}

}
