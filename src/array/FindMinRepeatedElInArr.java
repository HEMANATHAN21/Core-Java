package array;

public class FindMinRepeatedElInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,2,1,3,4,3,5,5,5,6,11};
		boolean[] visited = new boolean[arr.length];
		int mincount=Integer.MAX_VALUE;
		int element=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i]==false)
			{
				int count =1;
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						visited[j]=true;
					}
				}
				if(count<mincount)
				{
					mincount=count;
					element=arr[i];
				}
				
			}
		}
		
		System.out.println("Least Repeated "+element);

	}

}
