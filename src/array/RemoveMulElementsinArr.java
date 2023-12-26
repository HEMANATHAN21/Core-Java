package array;
import java.util.Arrays;

public class RemoveMulElementsinArr 
{
	public static int indexof(int[] arr,int element)
	{
		int position = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				position=i;
				break;
			}
		}
		return position;
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int element=1;
		int [] arr = {1,2,5,1,6,7,1,8,9};

			for(int i=0;i<arr.length;i++)
			{
				int position=indexof(arr,element);
				if(position>=0)
				{
					for(int j = position;j<arr.length-1;j++)
					{
						arr[j]=arr[j+1];
					}
					arr[arr.length-1]=0;
				}
				
			}
			System.out.println(Arrays.toString(arr));
	}

}


