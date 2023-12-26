package FileHandling;
import java.io.*;
public class Serialization 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(123, "hemanathan", 100000);
		File f1 = new File("Employee.ser");
		
		
		try {
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp1);
			
			oos.flush();
			fos.flush();
			
			oos.close();
			fos.close();
			
			System.out.println("Serialization is done..");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
