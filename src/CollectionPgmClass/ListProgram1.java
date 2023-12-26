package CollectionPgmClass;
import java.util.*;
public class ListProgram1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*List l1 = new ArrayList();
		l1.add(1);
		l1.add(3);
		l1.add("solo");
		
		List<Integer> l2 = new ArrayList<>();
		List l3 = Arrays.asList(1,2,3,4);*/
		//List<Integer> l4 = new ArrayList<>(Arrays.asList(1,2,3,4));
		/*
		 * Retrival Methods 
		 * for each, Iterator, ListIterator, Index, Printing Reference Variable
		 */
		List<String> l1 = new ArrayList<>(Arrays.asList("solo","Hema","1"));
		
		System.out.println("\t ForEach");
		for(String s1 : l1)
		{
			System.out.print(s1+", ");
		}
		System.out.println();
		
		System.out.println("\t Iterator");
		Iterator itr1 = l1.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+", ");
		}
		System.out.println();


		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+", ");
		}
		System.out.println();
	
		for(Iterator itr2 = l1.iterator();itr2.hasNext();)
		{
			System.out.print(itr2.next()+", ");
		}
		System.out.println();
		
		System.out.println("\t Reference Variable");
		System.out.println(l1);
		
		
		System.out.println("\t ListIterator");
		ListIterator litr1 = l1.listIterator();
		while(litr1.hasNext())
		{
			System.out.println();
			litr1.next();
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		while(litr1.hasPrevious())
		{
			System.out.print(litr1.previous()+", ");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("\t Index");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("\t-----");
		for(int i=l1.size()-1;i>=0;i--)
		{
			System.out.println(l1.get(i));
		}

	}

}
