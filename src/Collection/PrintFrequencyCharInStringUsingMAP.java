package Collection;
import java.util.*;
import java.util.Map.Entry;
public class PrintFrequencyCharInStringUsingMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = sc.next();
		LinkedHashMap<Character,Integer> freq = new LinkedHashMap<>();
		
		char arr[] = str.toCharArray();
		
		for (char ch : arr) 
		{
			if(freq.containsKey(ch))
			{
				freq.put(ch, freq.get(ch)+1);
			}
			else
			{
				freq.put(ch, 1);
			}
			
		}
		//System.out.println(freq);
		/*for (Entry<Character,Integer> entry : freq.entrySet()) 
		{
			System.out.println(entry);
			
		}*/
		int max=0;
		char lmax =' ';
		Set<Entry<Character,Integer>> word = freq.entrySet();
		for (Entry<Character,Integer> rep : word) 
		{
			if(rep.getValue() >= max)
			{
				max =  rep.getValue();
			    lmax = rep.getKey();
			}
		}
		
		System.out.println("repeted Ele is '"+lmax+"' Count is "+max);
		

	}

}
