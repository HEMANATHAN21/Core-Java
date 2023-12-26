package StringPgmClass;

public class IntToCharPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "12A12BB4GGG";
		int tempnum=0;
		String tempstring="";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch1 = s1.charAt(i);
			if(ch1>='0' && ch1<='9')
			{
				int num=ch1 - '0';
				tempnum = tempnum*10+num;
				
			}
			
			else if(ch1>='A' && ch1<='Z')
			{
				for(int j =i;j<s1.length();j++)
				{
					char ch2 = s1.charAt(j);
					if(ch2>='A' && ch2<='Z')
					{
						tempstring = tempstring+ch2;
					}
					else
					{
						break;
					}
				}
				
				for(int k=1;k<=tempnum;k++)
				{
					System.out.print(tempstring);
				}
				System.out.print(" ");
				tempnum=0;
				tempstring="";
			}
		}

	}

}
