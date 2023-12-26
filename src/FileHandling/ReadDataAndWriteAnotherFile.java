package FileHandling;
import java.io.*;
public class ReadDataAndWriteAnotherFile
{

	public static void main(String[] args) 
	{
		File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling\\data.txt");
		File f2 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling\\data.doc");
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try 
		{
			fr = new FileReader(f1);
	        int size = (int) f1.length();
	        char[] arr = new char[size];
	        fr.read(arr);
	            
	        f2.createNewFile();
	        fw = new FileWriter(f2);
	        fw.write(arr);
	            
	        System.out.println("Data successfully copied from " + f1.getAbsolutePath() + " to " + f2.getAbsolutePath());
	    } 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	    finally 
	    {
	    	try 
	    	{ 
	    		if (fr != null)
	    			fr.close();
	            if (fw != null)
	                fw.close();
	        } catch (IOException e) 
	    	{
	        	e.printStackTrace();
	    	}
	    }

	}

}
