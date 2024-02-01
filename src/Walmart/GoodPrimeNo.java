package Walmart;

public class GoodPrimeNo {

	public static void main(String[] args) 
	{
		int startingRange = 4;
		int primeCount = 4;
		int count = 0;
		//int goodPrime = 0;
		
		for(int i=startingRange+1; ;i++)
		{
			if(GoodPrimeNo.digitCount(i) == 2)
			{
				int sumDigit = GoodPrimeNo.sumOfDigit(i);
				if(GoodPrimeNo.primeNoCheck(sumDigit))
					count++;	
			}
			else if(GoodPrimeNo.digitCount(i) == 1)
			{
				if(GoodPrimeNo.primeNoCheck(i))
					count++;
			}
			
			if(primeCount == count)
			{
				//goodPrime = i;
				System.out.println("Good Prime No Is : "+i);
				break;
			}
				
		}
	}
	
	public static boolean primeNoCheck(int num)
	{
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				
				count++;
			}
		}
		if(count == 2)
			return true;
		else
			return false;
	}
	
	public static int digitCount(int num)
	{
		int dc = 0;
		while(num>0)
		{
			dc++;
			num = num /10;
		}
		return dc;
	}
	
	public static int sumOfDigit(int num)
	{
		int sum = 0;
		while(num >0)
		{
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

}
