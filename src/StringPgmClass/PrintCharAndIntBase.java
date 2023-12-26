package StringPgmClass;

public class PrintCharAndIntBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AA10B5ABC3";
		String tempstring="";
		int tempnum=0;
		
		for(int i=0;i<s1.length();i++)
		{
			char ch1 = s1.charAt(i);
			if(ch1>='A' && ch1<='Z')
			{
				tempstring = tempstring+ch1;
			}
			else if(ch1>='0' && ch1<='9')
			{
				for(int j=i;j<s1.length();j++)
				{
					char ch2 = s1.charAt(j);
					if(ch2>='0' && ch2<='9')
					{
						int num = ch2 - '0';
						tempnum = tempnum*10 + num;
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
				tempstring="";
				tempnum=0;
				System.out.print(" ");
			}
		}
	}

}
