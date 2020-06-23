import java.io.*;
import java.util.*;

class GFG{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			Solution g = new Solution();
			ArrayList<Integer> ans = g.duplicates(a,n);
			for(Integer val:ans)
				System.out.println(val+" ");
			System.out.println();
		}
	}
}


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        
        int count=1;
        for(int i=0;i<n-1;i+=count)
        {
            count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                       count++;
                else
                    break;
            }
            if(count!=1)
                list.add(arr[i]);
        }
        if(list.isEmpty())
            {
                list.add(-1);
                return list;
            }
        return list;
    }
}