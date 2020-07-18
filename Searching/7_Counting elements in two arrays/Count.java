import java.util.*;

class Count
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();

			int arr1[] = new int[m];
			int arr2[] = new int[n];

			for(int i=0;i<m;i++)
				arr1[i] = sc.nextInt();

			for(int i=0;i<n;i++)
				arr2[i] = sc.nextInt();


			GfG gfg = new GfG();
			ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1,arr2,m,n);
			for(int i=0;i<res.size();i++)
				System.out.print(res.get(i)+" ");
			System.out.println();
		}
	}
}


// Complete the function given below
class GfG
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       ArrayList<Integer> list = new ArrayList<>(m);
       Arrays.sort(arr2);
       
       int idx = -1;
       for(int i=0;i<arr1.length;i++)
       {
           idx = search(arr2,arr1[i]);
           list.add(idx+1);
       }
       
       return list;
    }
    
    public static int search(int[] arr2,int n)
    {
        int low = 0;
        int idx = -1;
        int high = arr2.length-1;
        int mid = 0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(arr2[mid]<=n)
                {
                    idx = mid;
                    low = mid+1;
                }
            else
                high = mid-1;
        }
        
        return idx;
    }
}
