package CollectionPgmClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class PrintDuplicateUsingCollection 
{
	public static void main(String[] args) {
	List<String> l1 = new ArrayList<String>(Arrays.asList("A","B","A","A","B"));
	for(int i=0;i<l1.size();i++)
	{
		int flag =0;
		String str1=l1.get(i);
		for(int j=i+1;j<l1.size();j++)
		{
			String str2=l1.get(j);
			if(str1 == str2)
			{
				l1.remove(j);
				flag = 1;
			}
		}
		
		if(flag == 1)
		{
			System.out.println(str1);
		}
	}
	
	List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,4,4,6,7));
	List<Integer> l3 = new ArrayList<Integer>();
	for(int i=0;i<l2.size();i++)
	{
		if(!l3.contains(l2.get(i)))
		{
			l3.add(l2.get(i));
		}
	}
	System.out.println(l3);
	
	Set<Integer> s1 = new LinkedHashSet<Integer>(l2);
	System.out.println(s1);
	
	
}
}
