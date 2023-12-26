package CollectionPgmClass;
import java.util.*;
public class StackInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(4);
		s1.push(5);
		s1.push(5);
		s1.push(7);
		s1.push(9);
		s1.push(null);
		System.out.println(s1.pop());
		Object o1 = s1.pop();
		
		/*while(o1 != null)
		{
			System.out.println(o1);
			if(!s1.isEmpty())
			{
				o1 = s1.pop();
			}
			else
			{
				break;
			}
		}*/
		System.out.println("---------------------------");
		
		for(int i=s1.size()-1;i>=0;i--)
		{
			System.out.println(s1.pop());
		}

	}

}
