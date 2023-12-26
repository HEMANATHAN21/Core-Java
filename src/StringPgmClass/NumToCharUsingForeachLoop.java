package StringPgmClass;

public class NumToCharUsingForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "a1d2f4 ";
		int num =0;
		char mychar = '\0';
		
		char[] arr = s1.toCharArray();
		for(char ch : arr)
		{
			//mychar=ch;///To start with integer
			if(Character.isDigit(ch))
			{
				num = num*10+ch-48;
			}
			else
			{
				for(int i=1;i<=num;i++)
				{
					System.out.print(mychar);
				}
				mychar=ch;//here give start with char
				num=0;
			}
		}

	}

}
