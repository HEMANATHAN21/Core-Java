package Walmart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println(l1);
		System.out.println(l1.size());
		Iterator<Integer> itr = l1.iterator();
		
		for(int i=l1.size()-1;i>=0;i--)
		{
//			System.out.println(l1.get(i));
			l2.add(l1.get(i));
		}
		System.out.println(l2);
	}
}
