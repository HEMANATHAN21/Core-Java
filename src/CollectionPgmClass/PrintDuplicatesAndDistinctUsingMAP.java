package CollectionPgmClass;
import java.util.*;
import java.util.Map.Entry;
public class PrintDuplicatesAndDistinctUsingMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character,Integer> freq = new LinkedHashMap<>();
		String s1 = "programming";
		char arr []= s1.toCharArray();
		
		/*for (char ch : arr) 
		{
			if(freq.containsKey(ch))
			{
				freq.put(ch, freq.get(ch)+1);
			}
			else
			{
				freq.put(ch, 1);
			}
			
		}*/
		/////////Alternative
		int i=0;
		while(i!=arr.length)
		{
			if(freq.containsKey(arr[i])==false)
			{
				freq.put(arr[i], 1);
			}
			else
			{
				freq.put(arr[i], freq.get(arr[i]) + 1);
				//freq.remove(arr[i]);//remove duplicates
			}
			i++;
		}
		
		System.out.println(freq);
		//Set<Entry<Character,Integer>> word = freq.entrySet();
		System.out.print("Duplicates : ");
		for (Entry<Character,Integer> rep : freq.entrySet()) 
		{
			if(rep.getValue() > 1)
			{
				System.out.print(rep.getKey()+" ");
			}
		}
		System.out.println();
		System.out.print("Distinct : ");
		for (Entry<Character,Integer> rep : freq.entrySet()) 
		{
			if(rep.getValue() == 1)
			{
				System.out.print(rep.getKey()+" ");
			}
		}
		System.out.println();
		System.out.println("\tChar Frequency ");
		for (Entry<Character,Integer> rep : freq.entrySet()) 
		{
			System.out.println(rep.getValue()+" Present In "+rep.getKey()+" Times");
		}
		
		System.out.println("\t Maximum frequent word");
		
		int max=0;
		char lmax =' ';
		int occurence = 3;
		int newoccr = 0;
		Set<Entry<Character,Integer>> word = freq.entrySet();
		for (Entry<Character,Integer> rep : word) 
		{
			if(rep.getValue() > max )
			{
				max =  rep.getValue();
			    lmax = rep.getKey();
			    newoccr++;
			}
			
			/*if(occurence == newoccr)
			{
				System.out.println("repeted Ele is '"+lmax+"' Count is "+max);
			}*/
		}
		
		//System.out.println("repeted Ele is '"+lmax+"' Count is "+max);
	}

}
