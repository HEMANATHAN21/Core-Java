package Bank_application;

class Account
{
	final static String BankName="Indian Overseas Bank";
	final int AccNo;
	final String AccHolderName;
		  double AccBalance;
	Account(int AccNo,String AccHolderName,double AccBalance)
	{
		this.AccNo=AccNo;
		this.AccHolderName=AccHolderName;
		this.AccBalance=AccBalance;
	}
	
	Account(int AccNo,String AccHolderName)
	{
		this(AccNo,AccHolderName,0.0);
		
	}
	
	void AmountDeposit(double Amount)
	{
		System.out.println("Amount Deposited");
	}
	
	void AmountWithdraw(double Amount)
	{
		System.out.println("Amount Withdrawed");
	}
	void BalanceEnquiry()
	{
		System.out.println("Account Balance Is "+AccBalance);
	}
	
}

class SavingsAccount extends Account
{
	SavingsAccount(int AccNo,String AccHolderName,double AccBalance)
	{
		super(AccNo,AccHolderName,AccBalance);
		System.out.println("Savings Account Is Created");
	}
	
	SavingsAccount(int AccNo,String AccHolderName)
	{
		super(AccNo,AccHolderName);
		System.out.println("Savings Account Is Created");
	}
	
	void AmountDeposit(double Amount)
	{
		if(Amount>0)
		{
			AccBalance = AccBalance+Amount;
			System.out.println("Amount Deposited");
			BalanceEnquiry();
		}
		else
		{
			System.out.println("Invalid Transaction");
		}
	}
	
	void AmountWithdraw(double Amount)
	{
		if(Amount<=0) 
		{
			System.out.println("Invalid Transaction");
		}
		else
		{
			AccBalance = AccBalance-Amount;
			System.out.println("Amount Withdrawed");
			BalanceEnquiry();
		}
	}
}

class LoanAccount extends Account
{
	LoanAccount(int AccNo,String AccHolderName,double AccBalance)
	{
		super(AccNo,AccHolderName,AccBalance);
		System.out.println("LoanAccount Is Created");
	}
	
	LoanAccount(int AccNo,String AccHolderName)
	{
		super(AccNo,AccHolderName);
		System.out.println("LoanAccount Is Created");
	}
	
	void AmountDeposit(double Amount)
	{
		if(Amount>0)
		{
			AccBalance = AccBalance-Amount;
			System.out.println("Amount Deposited");
			BalanceEnquiry();
		}
		else
		{
			System.out.println("Invalid Transaction");
		}
	}
	
	void AmountWithdraw(double Amount)
	{
		if(Amount<=0) 
		{
			System.out.println("Invalid Transaction");
		}
		else
		{
			AccBalance = AccBalance+Amount;
			System.out.println("Amount Withdrawed");
			BalanceEnquiry();
		}
	}
}

public class bankapp {

	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		System.out.println("Welcome To "+Account.BankName);
		System.out.println("--------------------------------------");
		SavingsAccount SA = new SavingsAccount(1234,"Hema",10000.0);
		SA.BalanceEnquiry();
		SA.AmountDeposit(10000);
		SA.AmountWithdraw(5000);
		
		LoanAccount LA = new LoanAccount(5678,"varshan",500000.0);
		LA.BalanceEnquiry();
		LA.AmountDeposit(0);
		LA.AmountWithdraw(0);

	}

}
