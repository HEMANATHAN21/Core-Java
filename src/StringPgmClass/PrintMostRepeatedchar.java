package StringPgmClass;
import java.util.*;

public class PrintMostRepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String value = sc.next();
		int occurence = 0;
		char max = ' ';
		char fmax = ' ';
		
		for(int i=0;i<value.length();i++)
		{
			char ch1 = value.charAt(i);
			
			for(int j=0;j<value.length();j++)
			{
				char ch2 = value.charAt(j);
				if(ch1 == ch2)
				{
					occurence++;
					if(occurence ==1)
					{
						max = ch2;
					}
					else if(occurence != 1 && max == ch2)
					{
						fmax = max;
					}
				}
			}
			System.out.println("The repeated element is : "+fmax);
		}
	}

}
