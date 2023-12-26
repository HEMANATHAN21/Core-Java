package StringPgmClass;

public class Example1 {
	public static void main(String[] args) {
		String s1 = "Hema ";
		String s2 = new String("SOLO");
		System.out.println(s1.split("E"));
		System.out.println(s1.charAt(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.contains("H"));
		System.out.println(s1.startsWith("HE"));
		System.out.println(s1.endsWith("A"));
		System.out.println(s1.replace('M','A'));
		System.out.println(s1.replace("E","A"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.indexOf("A"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("HEMA"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println();
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		
	}
}
