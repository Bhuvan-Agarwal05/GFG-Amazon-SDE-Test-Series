import java.io.*;
import java.util.*;

class GFG{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int[] array = new int[n];
			for(int i=0;i<n;i++)
				array[i] = sc.nextInt();

			Solution ob = new Solution();
			long[] ans = new long[n];
			ans = ob.productExceptSelf(array,n);

			for(int i=0;i<n;i++){
				System.out.println(ans[i]+" ");
			}
			System.out.println();
			t--;
		}
	}
}
//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long[] output = new long[n];
        long prod = 1;
        int flag=0,count=0;
        for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                    {
                        count++; // count of zeroes
                        flag=1; // contains zero
                    }
                else
                    prod *= arr[i];
            }
        if(count>1)
            return output;  // If there are more than 1 zero in the array , all elements will be 0. So return Directly.
        else if(flag==1)
        {
            for(int i=0;i<n;i++)
                if(arr[i]==0)
                   output[i] = prod;  // If there is 1 zero , then replace all places with 0 and in place of zero put the product.
            return output;
        }
        else
        {
            for(int i=0;i<n;i++)
                output[i] = prod/arr[i];
            return output;  // If No zero is present, then put prod/arr[i];
        }
	} 
} 