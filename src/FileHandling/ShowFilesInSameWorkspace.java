package FileHandling;
import java.io.*;
public class ShowFilesInSameWorkspace 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//File f1 = new File("C:\\Users\\HEMANATHAN\\eclipse-workspace\\JSPIDER\\src\\FileHandling");//Access Denied
		File f1 = new File("D:\\STUDY MATERIALS\\JAVA\\FileHandling");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}

	}

}
