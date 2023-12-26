package Collection;
import java.util.*;
public class SetCollectionWithTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set names = new HashSet();//not preserve insertion order
		//Set names = new LinkedHashSet();//preserve insertion order
		names.add("solo");
		names.add("hema");
		names.add("hema");
		names.add(null);
		names.add(new StringBuffer("varshan"));
		names.add(new StringBuffer("varshan"));
		for(Object name : names)
		{
			System.out.println(name);
		}

	}

}
