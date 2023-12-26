package array;
import java.util.*;

public class FindAddingEleinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Array Count : ");
		int count = sc.nextInt();
		int arr[] = new int[count];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<count;i++)
		{
			System.out.print("arr["+i+"]= ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter The Adding Element : ");
		int Addele = sc.nextInt();		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] + arr[j] == Addele)
				{
					System.out.println("Element  Value : "+arr[i]+" + "+arr[j]+" = "+Addele+" AND iNDEX IS "+i+" + "+j+" ");
					
				}
				else
				{
					System.out.println("No Adding Element Found!!!`");
				}
			}
		}

	}

}
