package Collection;
import java.util.*;
public class WrapperClassTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(50);
		Integer i2 = 50;//AUTOBOXING
		System.out.println("i1 Value Is : "+i1);
		System.out.println("i2 Value Is : "+i2);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i1.equals(i2));
		
		int y = i1;//AUTOUNBOXING
		System.out.println("Y Value Is : "+y);
		String s1 = "123";
		int z = Integer.parseInt(s1);
		System.out.println(z);
		System.out.println(s1.equals(z));
		double d = Double.parseDouble(s1);
		System.out.println(d);
		System.out.println("----------------------------");
		
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(1);//AUTOBOXING
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		for(Integer x : c1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("c1 = "+c1);
		
		Collection<Integer> c2 = new ArrayList<Integer>();
		c2.add(2);
		c2.add(3);
		c1.addAll(c2);
		System.out.println("c1 = "+c1);
		//c2.add(7);
		//System.out.println("c1 = "+c2);
		System.out.println(c1.containsAll(c2));
		//c1.removeAll(c2);
		c1.retainAll(c2);
		System.out.println("c1 = "+c1);
		
		

	}

}
