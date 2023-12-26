package CollectionPgmClass;
import java.util.*;
public class FindFirMaxAndSecMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,4));
		int firstmax=0;
		int secondmax=0;
		//IndexType
		/*for(int i=0;i<l1.size();i++)
		{
			int num = l1.get(i);
			if(num>firstmax)
			{
				secondmax = firstmax;
				firstmax = num;
			}
			else if(num>secondmax && num!=firstmax)
			{
				secondmax = num;
			}
		}
		System.out.println(firstmax);
		System.out.println(secondmax);*/
		
		//ForEachType
		/*for(int num : l1)
		{
			if(num>firstmax)
			{
				secondmax = firstmax;
				firstmax = num;
			}
			else if(num>secondmax && num!=firstmax)
			{
				secondmax = num;
			}
			
		}*/
		
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			int num = (int) itr.next();
			if(num>firstmax)
			{
				secondmax = firstmax;
				firstmax = num;
			}
			else if(num>secondmax && num!=firstmax)
			{
				secondmax = num;
			}
		}
		System.out.println(firstmax);
		System.out.println(secondmax);
	}

}
