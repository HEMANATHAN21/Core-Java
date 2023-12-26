package array;
import java.util.Arrays;
class removeduplicates
{
	static void removeduplicates(int[] arr)
	{
		int [] result = new int[arr.length];
		int pos=0;
		for(int ele : arr)
		{
			int flag=0;
			for(int j=0;j<pos;j++)
			{
				if(ele==result[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				result[pos]=ele;
				pos++;
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
}

public class DuplicatesRemovingWithNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,3,4,2,5,6,2,6,5,8};
		removeduplicates.removeduplicates(arr);
		

	}

	 



}
