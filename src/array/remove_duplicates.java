package array;
import java.util.Scanner;
public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter count : ");
		int count = sc.nextInt();
		int arr[]=new int[count];
		
		for(int i=0;i<count;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int temp[]=new int[count];
		int j=0;
		
		for(int i=0;i<count-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		 temp[j++]=arr[count-1];

	        for(int k=0;k<count;k++)
	        {
	            System.out.print(temp[k]+" ");
	        }
	}

}
