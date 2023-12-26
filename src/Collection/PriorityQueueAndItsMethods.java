package Collection;
import java.util.*;
public class PriorityQueueAndItsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Methods
		 * 	peek(),poll()
		 * 
		 */
		Queue<Integer> PQ = new PriorityQueue<>();
		PQ.add(7);
		PQ.add(8);
		PQ.add(1);
		PQ.add(4);
		PQ.add(9);
		PQ.add(3);
		PQ.add(7);//allow duplicates
		//PQ.add(null);//not allow null value [NullPointerException]
		System.out.println(PQ);
		System.out.println(PQ.peek());//gives head element and not remove from collection
		System.out.println(PQ);
		System.out.println(PQ.poll());//gives head element and  remove from collection
		System.out.println(PQ);
		
		Object o1 = PQ.poll();
		System.out.println("-----------------------");
		while(o1 != null)
		{
			System.out.println(o1);
			o1 = PQ.poll();
		}
		System.out.println("-----------------------");
		System.out.println(PQ);
		
	}

}
