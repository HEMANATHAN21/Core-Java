package Collection;
import java.util.*;
public class ListCollectionWithTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<Integer>();
		//List<Integer> nums = new Vector<Integer>();
		//List<Integer> nums = new LinkedList<Integer>();
		nums.add(23);
		nums.add(11);
		nums.add(45);
		nums.add(34);
		nums.add(1);
		nums.add(34);
		//Index Based Operation
		System.out.println(nums);
		//nums.remove(2);
		nums.set(2, 42);//replace
		nums.add(1, 32);
		System.out.println(nums);
		
		for(int i=0;i<nums.size();i++)
		{
			System.out.println(i+"-->"+nums.get(i));
		}
		System.out.println(nums.subList(1, 4));
		System.out.println(nums.indexOf(34));
		System.out.println(nums.lastIndexOf(34));
		System.out.println("---------------------------------");
		
		//Iterator itr = nums.iterator();
		ListIterator litr = nums.listIterator(3);
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("--------------------");
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
