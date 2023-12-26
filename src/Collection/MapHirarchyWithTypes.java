package Collection;

import java.util.*;
import java.util.Map.Entry;

public class MapHirarchyWithTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> mobiles = new HashMap<>();//not preserve insertion order
		//LinkedHashMap<String, Integer> mobiles = new LinkedHashMap<>();//preserve insertion order
		//TreeMap<String, Integer> mobiles = new TreeMap<>();//preserve insertion order
		mobiles.put("1100", 15);
		mobiles.put("Samsung", 8);
		mobiles.put("Apple", 3);
		mobiles.put("Oppo", 12);
		
		System.out.println(mobiles);
		
		//Searching Via key
		System.out.println(mobiles.containsKey("Apple"));
		//Removing Entry from map
		mobiles.remove("1100");
		
		//Accessing using Set of Keys
		Set<String> ks = mobiles.keySet();
		for (String mobile : ks) 
		{
			System.out.println(mobile);
		}
		
		//Accessing using Set of Entries
		Set<Entry<String,Integer>> es = mobiles.entrySet();
		for (Entry<String, Integer> mobile : es) 
		{
			System.out.println(mobile);
		}
	}

}
