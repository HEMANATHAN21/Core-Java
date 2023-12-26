package array;

public class FindMostRepeatedEleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,3,4,7,7,7,7,73,5,5,5,6};
		boolean[] visited = new boolean[arr.length];
		int occurencecount=0;
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
				if(count>1)
				{
					if(count>occurencecount)
					{
						occurencecount=count;
						element=arr[i];
					}
				}
				
			}
		}
		
		System.out.println("Most Repeated : "+element);
	}

}
