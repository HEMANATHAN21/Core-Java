package CollectionPgmClass;
import java.util.*;
import java.util.Map.Entry;

public class MapExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		map.put('e', 1);
		map.put('o', 5);
		map.put('q', 9);
		System.out.println(map.get('0'));
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.containsKey('q'));
		System.out.println(map.getOrDefault('z', 25));
		
		for(Character e1 : map.keySet())
		{
			System.out.println(e1);
		}
		
		for(Entry<Character,Integer> e1 : map.entrySet())
		{
			System.out.println(e1.getKey()+"---->"+e1.getValue());
		}
		
		

	}

}
