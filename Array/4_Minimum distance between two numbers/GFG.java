import java.io.*;
import java.util.*;


class GFG{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i=0;i<n;i++)
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a,n,x,y));

        }
    }
}
// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:a)
            list.add(i);
        
        int min = Integer.MAX_VALUE;
        if(list.contains(x) && list.contains(y))
        {
            ArrayList<Integer> xIndex = new ArrayList<>();
            ArrayList<Integer> yIndex = new ArrayList<>();
            for(int i=0;i<list.size();i++)
            {
                if(a[i]==x)
                    xIndex.add(i);  // Store all the indexes of x
                else if(a[i]==y)
                    yIndex.add(i);  // Store all the indexes of y
            }
            
            for(int i:xIndex)
            {
                for(int j:yIndex)
                {
                    if(Math.abs(i-j) < min ) 
                        min = Math.abs(i-j);
                }
            }
            return min;
            
        }
        else
            return -1;
    }
}