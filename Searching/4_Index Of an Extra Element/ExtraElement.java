import java.util.*;

class ExtraElement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n-1];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			for(int i=0;i<n-1;i++)
				b[i] = sc.nextInt();

			GfG g = new GfG();
			System.out.println(g.findExtra(a,b,n));
		}
	}
}


/*Complete the function below*/
class GfG {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
       /* 
          This also Works Fine
       
           for(int i=0;i<b.length;i++)
            {
                if(a[i]!=b[i])
                    return i;
            }
            return n-1;
        
        */
        
        int low = 0;
        int high = b.length-1;
        int mid=0;
        int ans=-1;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(b[mid]==a[mid])
                low = mid+1;
            else
                {
                    ans = mid;
                    high = mid-1;
                }
        }
        if(ans==-1)
            return n-1;
        else
            return ans;
    }
}