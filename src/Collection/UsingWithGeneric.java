package Collection;
import java.util.*;
public class UsingWithGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection<String> names = new LinkedList<String>();//JDK 1.6
		Collection<String> names = new LinkedList<>();//JDK 1.7
		names.add("solo");
		names.add("hemanathan");
		names.add("varshan");
		
		for(String name : names)
		{
			System.out.println(name);
		}

	}

}
