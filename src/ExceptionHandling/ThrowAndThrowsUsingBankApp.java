package ExceptionHandling;
import java.lang.*;

class InvalidAmountException extends Exception
{
	InvalidAmountException()
	{
		System.out.println("InvalidAmountException Object is created...");
	}
	
	void amountHandling()
	{
		System.out.println("User Entered Wrong Amount...");
	}
}
public class ThrowAndThrowsUsingBankApp 
{
	public static void main(String[] args) 
	{
		initiateTXN(-1000.0);
	}

	private static void initiateTXN(double amount) 
	{
		try
		{
			transaction(amount);
		} catch (InvalidAmountException e) 
		{
			e.amountHandling();
			e.printStackTrace();
		}
	}

	private static void transaction(double amount) throws InvalidAmountException 
	{
		if(amount >0)
		{
			System.out.println("Transaction is initiated Rs."+amount);
		}
		else
		{
			throw new InvalidAmountException();
		}
		
	}

}
