import java.util.*;

class PeakElement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();

			int A = new Peak().peakElement(a,n);
			int f = 0;
			if(n==1)
				f=1;
			else
			{
				if(A==0 && a[0]>=a[1])
					f=1;
				else if(A==n-1 && a[n-1]>=a[n-2])
					f=1;
				else if(a[A] >= a[A+1] && a[A]>= a[A-1])
					f=1;
				else
					f=0; 
			}
			System.out.println(f);
		}
	}
}

/*Complete the function below*/

class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
       //add code here.
       if(n==1)
         return 0;
       else if(a[0]>a[1])
         return 0;
       else if(a[n-1]>a[n-2])
         return n-1;
       else
       {
           for(int i=1;i<n-1;i++)
           {
               if(a[i]>a[i-1] && a[i]>a[i+1])
                   return i;
           }
       }
       return -1;
    }
}