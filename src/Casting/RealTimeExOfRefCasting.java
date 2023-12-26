package Casting;

class ModeOfPayment
{
	static void display()
	{
		System.out.println("Select Payment Method");
	}
}

class CashOnDelivery extends ModeOfPayment
{
	static void display()
	{
		System.out.println("pay on cash mode");
	}
}

class UPIPayment extends CashOnDelivery
{
	static void display()
	{
		System.out.println("pay on UPI");
	}
}

class DebitCard extends UPIPayment
{
	static void display()
	{
		System.out.println("Pay on card");
	}
}

public class RealTimeExOfRefCasting {
	
	void Usinginstanceof(ModeOfPayment pay)
	{
		if(pay instanceof DebitCard)
		{
			DebitCard dc=(DebitCard)pay;//downcasting
			dc.display();
			
		}
		else if(pay instanceof UPIPayment)
		{
			UPIPayment upi=(UPIPayment)pay;
			upi.display();
		}
		else if(pay instanceof CashOnDelivery)
		{
			 CashOnDelivery cd=(CashOnDelivery)pay;
			 cd.display();
			
		}
		else
		{
			ModeOfPayment.display();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RealTimeExOfRefCasting pay = new RealTimeExOfRefCasting();
		pay.Usinginstanceof(new ModeOfPayment());
		pay.Usinginstanceof(new CashOnDelivery());
		pay.Usinginstanceof(new UPIPayment());
		pay.Usinginstanceof(new DebitCard());
		
		
	}

}
