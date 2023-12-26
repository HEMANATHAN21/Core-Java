package ExceptionHandling;

public class TryWithMultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******************************");
		try
		{
			String s1 = "abc";
			System.out.println(10/0);
			System.out.println(s1.charAt(10));
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("I am in AE | NPE");
		}
		catch(RuntimeException e)
		{
			System.out.println("I am in RuntimeException");
		}
		catch(Exception e)
		{
			System.out.println("I am in Exception");
		}
		System.out.println("*******************************");

	}

}
