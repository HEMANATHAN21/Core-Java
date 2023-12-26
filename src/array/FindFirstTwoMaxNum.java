package array;

public class FindFirstTwoMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,1,3};
        int fmax=0;
        int smax=0;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]>fmax)
                {
                    smax=fmax;
                    fmax=arr[i];
                }
                else if(arr[i]>smax)
                {
                    smax=arr[i];
                }
        }
        System.out.println("The first Maximum Num Is : "+fmax);
        System.out.println("The second Maximum Num Is : "+smax);

	}

}
