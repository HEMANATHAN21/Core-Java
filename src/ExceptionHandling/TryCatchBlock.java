package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 0;
		int n3 = 0;
		
		try
		{
			//Code causes Exception
			n3 = n1 / n2;
		}
		catch(Exception e)
		{
			System.out.println(e);
			//Solution Code
			n3 = n1 / 1;
		}
		
		System.out.println(" n1 value is : "+n1);
		System.out.println(" n2 value is : "+n2);
		System.out.println(" n3 value is : "+n3);
		

	}

}
