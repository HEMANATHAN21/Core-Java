package String;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1.equals(sb2));
		sb1.append("xyz");
		System.out.println(sb1);
		sb1.insert(3, "abc");
		System.out.println(sb1);
		sb2.reverse();
		System.out.println(sb2);
		
	}

}
