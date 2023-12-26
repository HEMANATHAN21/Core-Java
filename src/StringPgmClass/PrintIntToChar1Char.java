package StringPgmClass;

public class PrintIntToChar1Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "2A13B4C";
		
		int num = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num = num*10+ch-48;
			}
			else
			{
				while(num>0)
				{
					System.out.print(ch);
					num--;
				}
			}
		}

	}

}
