package ExceptionHandling;

public class TryCatchFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("****************************");
		
		try
		{
			//Code Causes Exception
			System.out.println("Before Exception...");
			System.out.println(10/0);
			System.out.println("After Exception...");
		}
		catch(Exception e)
		{
			//Solution Code
			System.out.println("I am In Catch Block...");
		}
		finally
		{
			//Mandatory Code
			System.out.println("I am In Finally Block...");
		}
		System.out.println("****************************");

	}

}
