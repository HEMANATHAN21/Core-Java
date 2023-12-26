package Collection;
import java.util.*;
public class TreeSetTyOfSetAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set ts = new TreeSet();
		ts.add(10);
		ts.add(8);
		ts.add(12);
		ts.add(7);
		ts.add(9);
		//ts.add("abc");//ClassCastException
		//ts.add(null);//NullPointerException
		
		System.out.println(ts);
		
		Set<String> names = new TreeSet<String>();
		names.add("Vijay");
		names.add("Ajith");
		names.add("GpMuthu");
		names.add("CoolSuresh");
		
		System.out.println(names);

	}

}
