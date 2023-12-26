package array;
import java.util.*;
public class PalindromeCountInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Count : ");
		int count = sc.nextInt();
		String [] arr = new String[count];
		int palicount=0;
		
		for(int i=0;i<count;i++)
		{
			System.out.print("arr["+i+"] = ");
			arr[i] = sc.next();
		}
		
		for(int i=0;i<count;i++)
		{
			String word = arr[i];
			String paliRes="";
			
			for(int j=0;j<word.length();j++)
			{
				paliRes =  word.charAt(j) + paliRes;
			}
			if(word.equals(paliRes))
			{
				System.out.println("It Is Palindrome : "+paliRes);
				palicount++;
			}
		}
		System.out.println("Palindrome count is : "+palicount);

	}

}
