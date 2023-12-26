package array;

public class DuplicatedEleCountUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,3,4,3,5,5,6};
		boolean[] visited = new boolean[arr.length];
		
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
				/*if(count>1)
				{
					System.out.println("Duplicate : "+arr[i]);
				}*/
				if(count==1)
				{
					System.out.println("Distinct : "+arr[i]);
					break;
				}
				//System.out.println(arr[i]+" Present In "+count+" Times");
			}
		}
	}

}
