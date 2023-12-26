package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


import Applications.StudentAppUsingArray;

public class RetrivalUsingForEachAndIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		
		c1.add("abc");
        c1.add(new String("xyz"));
        c1.add(new StringBuffer("solo"));
        //c1.add(new Sample1());
        c1.add(new StudentAppUsingArray(001,"HEMANATHAN",new double[]{100,80,70}));
        
        System.out.println("-----------ForEach Retrival----------------------");
        for(Object o1 : c1)
        {
        	System.out.println(o1);
        }
        System.out.println("-----------Iterator Retrival----------------------");
        Iterator itr = c1.iterator();
        
        while(itr.hasNext())
        {
        	Object o1 = itr.next();
        	System.out.println(o1);
        }
        
    
	}

}
