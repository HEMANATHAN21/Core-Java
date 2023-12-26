package array;
import java.util.*;
public class RotateArrayByCount {
	
	
	static int[] arraymethod(int num)
	{
		int arr[]=new int[num];
		System.out.println("Enter Array Elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num;i++)
		{
			System.out.print("arr["+i+"] = ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter --1--For Left To Right");
		System.out.println("Enter --2--For Right To Left");
		int rotate=sc.nextInt();
		
		switch(rotate)
		{
		case 1 : System.out.print("Enter the Array count : ");
				 int Arrcount = sc.nextInt();
				 int[]  arr = arraymethod(Arrcount);
				 System.out.print("Enter Rotation Count : ");
				int Rotcount = sc.nextInt();
				for(int k=0;k<Rotcount;k++)
				{
					for(int l=0;l<Arrcount;l++)
					{
						if(l==0)
						{
							int temp = arr[l];
							for(int m=0;m<Arrcount-1;m++)
							{
								arr[m]=arr[m+1];
								
							}
							arr[Arrcount-1]=temp;
						}
				
					}
					System.out.println(Arrays.toString(arr));
				}
				break;
		case 2 : 
			System.out.print("Enter the Array count : ");
			 int Arrcount1 = sc.nextInt();
			 int[]  arr1 = arraymethod(Arrcount1);
			 System.out.print("Enter Rotation Count : ");
			int Rotcount1 = sc.nextInt();
			for(int k=0;k<Rotcount1;k++)
			{
				for(int l=0;l<Arrcount1;l++)
				{
					if(l==0)
					{
						int temp=arr1[l];
						arr1[l]=arr1[arr1.length-1];
						
						for(int m=1;m<Arrcount1;m++)
						{
							int temp1=arr1[m];
							arr1[m]=temp;
							temp=temp1;
							
						}
					}
			
				}
				System.out.println(Arrays.toString(arr1));
			}
		
		
		}
		
		
		
		
		
	}

}
