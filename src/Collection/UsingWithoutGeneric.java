package Collection;

import java.util.Collection;
import java.util.LinkedList;

public class UsingWithoutGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection names = new LinkedList();//JDK 1.7
		names.add("solo");
		names.add("hemanathan");
		names.add("varshan");
		
		for(Object o1 : names)
		{
			String name = (String)o1;//downcasting
			System.out.println(name);
		}
	}

}
