package FileHandling;
import java.io.*;
public class Deserialization 
{

	public static void main(String[] args) 
	{
		File f1 = new File("Employee.ser");
		
		try {
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
