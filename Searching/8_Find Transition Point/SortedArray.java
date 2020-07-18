import java.util.*;

class SortedArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			GfG obj = new GfG();
			System.out.println(obj.transitionPoint(arr,n));
		}
	}
}


class GfG {
    int transitionPoint(int arr[], int n) {
        int low = 0;
        int high = n-1;
        int mid = -1;
        
        int idx = -1; // means 1 not present
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(arr[mid]==1)
            {
                idx = mid;
                high = mid-1; // To find 1 as left as possible
            }
            else
                low = mid + 1;
        }
        
        return idx;
    }
}