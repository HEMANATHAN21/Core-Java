package array;

public class DecendingOrderWithChech2ndAnd1stDigit 
{
	public int lastDigit(int num)
	{
		int rem = 0;
		while(num !=0)
		{
			rem = num%10;
			break;
		}
		return rem;
	}
	
	public int beforeDigit(int num)
	{
		int rem = 0;
		int count =0;
		while(num !=0)
		{
			rem = num%10;
			count++;
			num = num/10;
			if(count == 2)
				break;
			
		}
		return rem;
	}
	
	
	

	public static void main(String[] args) 
	{
		DecendingOrderWithChech2ndAnd1stDigit dec = new DecendingOrderWithChech2ndAnd1stDigit();
		
		int[] arr = {15,20,28,32,58,76};
		
//		int num = 23;
//		System.out.println(dec.lastDigit(num));
//		System.out.println(dec.beforeDigit(num));
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int lastdigit = dec.lastDigit(arr[i]);
			if(max < lastdigit && max != lastdigit)
			{
				max = arr[i];
				
				for(int j=0;j<arr.length;j++)
				{
					int beforedigit = dec.beforeDigit(arr[j]);
					
					if(dec.beforeDigit(max) < beforedigit && dec.beforeDigit(max) != beforedigit)
					{
						max = arr[j];
					}
				}
			}
		}
		
		System.out.println("Max is "+max);
		
	}

}
