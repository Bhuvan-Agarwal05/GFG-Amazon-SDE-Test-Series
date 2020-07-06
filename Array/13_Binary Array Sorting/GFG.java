import java.io.*;
import java.util.*;

class GFG{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t > 0){
			int n = sc.nextInt();
			int array[] = new int[n];
			for(int i=0;i<n;i++)
				array[i] = sc.nextInt();

			Solution ob = new Solution();
			int result[] = new int[n];
			result = ob.SortBinaryArray(array,n);

			for(int i=0;i<n;i++)
				System.out.print(result[i] + " ");
			System.out.println();
			t--;
		}
	}
}

//User function Template for Java

class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int low = 0;
	    int high = n-1;
	    while(low<high)
	    {
	        if(arr[low]==0)
	          low++;
	        if(arr[high]==1)
	          high--;
	        if(low<high){
    	        if(arr[low]==1 && arr[high]==0)
    	          {
    	              arr[low] ^= arr[high];
    	              arr[high] ^= arr[low];
    	              arr[low] ^= arr[high];
    	              low++;
    	              high--;
    	          }
	        }
	    }
	    return arr;
	} 
} 
