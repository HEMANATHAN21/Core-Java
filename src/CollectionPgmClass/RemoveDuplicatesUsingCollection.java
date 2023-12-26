package CollectionPgmClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class RemoveDuplicatesUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,3,3,2,5,7,8,8,3,4,4,4));
		Iterator itr1 = l1.iterator();
		Iterator itr2 = l1.iterator();
		//l1.remove(4);
		System.out.println(l1);
		/*while(itr1.hasNext())
		{
			while(itr2.hasNext())
			{
				if(itr1.next() == itr2.next())
				{
					l1.remove(itr2.next());
				}
			}
		}*/
		
		for(int i=0;i<l1.size();i++)
		{
			int flag = 0;
			int num1=l1.get(i);
			for(int j=i+1;j<l1.size();j++)
			{
				int num2=l1.get(j);
				if(num1 == num2)
				{
					l1.remove(j);
				    flag=1;
				}
			}
			if(flag == 0)
			{
				System.out.print(num1+",");
			}
		}
		//System.out.println(l1);
		System.out.println();
		List<String> l2 = new ArrayList<String>(Arrays.asList("A","B","A"));
		for(int i=0;i<l2.size();i++)
		{
			int flag = 0;
			String str1=l2.get(i);
			for(int j=i+1;j<l2.size();j++)
			{
				String str2=l2.get(j);
				if(str1.equals(str2))
				{
					l2.remove(j);
					flag=1;
				}
			}
			if(flag == 0)
			{
				System.out.print(str1+",");
			}
		}
		//System.out.println(l2);
	}

}
