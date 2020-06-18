import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String str = br.readLine();
            String[] starr = str.split(" ");
            int n = Integer.parseInt(starr[0]);
            int d = Integer.parseInt(starr[1]);

            int[] arr = new int[n];
            String str1=br.readLine();
            String[] starr1 = str1.split(" ");
            for(int j=0;i<n;j++)
            {
                arr[j] = Integer.parseInt(starr1[j]);
            }

            new Solution().rotateArr(arr,d,n);
            StringBuffer sb = new StringBuffer();
            for(int t1=0;t1<n;t1++)
                sb.append(arr[t1]+" ");
            System.out.println(sb);
        }
    }
}


//User function Template for Java

class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        d = d % n;
        int[] out = new int[n];
        int k=0;
        for(int i=d;i<n;i++,k++)
           out[k] = arr[i];
        
        for(int i=0;i<d;i++,k++)
          out[k] = arr[i];
        
        for(int i=0;i<n;i++)
            arr[i] = out[i];
           
    }
}