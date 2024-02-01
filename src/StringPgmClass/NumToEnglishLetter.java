package StringPgmClass;

import java.util.Scanner;

public class NumToEnglishLetter 
{
	public int digitCount(int num)
	{
		int dc = 0;
		while(num!=0)
		{
			num=num/10;
			dc++;
		}
		return dc;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		NumToEnglishLetter nte = new NumToEnglishLetter();
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		String str2 = "";
		String temp = Integer.toString(num);
		
		String[] first = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] second = {"ten","eleven","twelve","thirteen","fourteen","fivteen","sixteen","seventeen","eighteen","nineteen"};
		//String[] third = {"ten","eleven","twelve","thirteen","fourteen","fivteen","sixteen","seventeen","eighteen","nineteen"};
		String[] fourth = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String[] fifth = {"hundred"};
		
		for(int i=1;i<=1;i++)
		{
			int dc = nte.digitCount(num);
			if(dc == 1)
			{
				char c1 = temp.charAt(0);
				int charint = c1 - '0';
				str2 = str2 + first[charint];
			}
			else if(dc == 2)
			{
				for(int j=0;j<temp.length()-1;j++)
				{
					char ch = temp.charAt(0);
					if(ch == '1')
					{
						char ch1 = temp.charAt(1);
						int charint = ch1 - '0';
						str2 = str2 + second[charint];
					}
					else if(ch != '1')
					{
						char ch1 = temp.charAt(1);
						if(ch1 == '0')
						{
							int charint = ch - '0';
							str2 = str2 + fourth[charint-1];
						}
						else if(ch != '0')
						{
							int charint = ch - '0';
							str2 = str2 + fourth[charint-1];
							
							str2 = str2 + " ";
							
							int seccharint = ch1 - '0';
							str2 = str2 + first[seccharint];
						}
						
					}
				}
			}
			else if(dc == 3)
			{
				char ch1 = temp.charAt(0);
				int charint1 = ch1 - '0';
				str2 = str2 + first[charint1];
				str2 = str2 + " ";
				str2 = str2 + fifth[0];
				str2 = str2 + " ";
				
				char ch2 = temp.charAt(1);
				if(ch2 == '0')
				{
					
					char ch3 = temp.charAt(2);
					if(ch3 != '0')
					{
						int charint3 = ch3 - '0';
						str2 = str2 + first[charint3];
					}
					
				}
				else if(ch2 != '0')
				{
					int charint2 = ch2 - '0';
					str2 = str2 + fourth[charint2-1];
					
					str2 = str2 + " ";
					
					char ch3 = temp.charAt(2);
					if(ch3 != '0')
					{
						int charint3 = ch3 - '0';
						str2 = str2 + first[charint3];
					}
					
				}

			}
			
		}
		
		System.out.println(str2);

	}

}
