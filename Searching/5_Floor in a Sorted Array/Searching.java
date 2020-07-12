import java.util.*;
import java.io.*;

class Searching{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-- > 0)
		{
			String a[] = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(a[0]);
			long x = Long.parseLong(a[(int)1]);
			String st[] = br.readLine().trim().split("\\s+");

			long arr[] = new long[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = Long.parseLong(st[i]);
			}

			System.out.println(new FloorSearch().findFloor(arr,0,n-1,x));
		}
	}
}


class FloorSearch{
    
    // Function to find floor of x
    // arr: input array
    // left and right as 0 and n-1, where n is the size of array
    static int findFloor(long arr[], int left, int right, long x)
    {
        int idx = -1;
        long max = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=x)
                {
                    if(arr[i] > max)
                        {
                            idx = i;
                            max = arr[i];
                        }
                }
            else
                break;
        }
        return idx;
    }   
}
