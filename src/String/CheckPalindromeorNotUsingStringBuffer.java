package String;

public class CheckPalindromeorNotUsingStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "HEMANATHAN";
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.reverse();
		String s2 = sb1.toString();
		if(s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("not Palindrome");
	}

}
