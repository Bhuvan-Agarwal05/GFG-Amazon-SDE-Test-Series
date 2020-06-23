import java.io.*;
import java.util.*;

class Difference{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			MaxDifference obj = new MaxDifference();
			System.out.println(obj.maxIndexDiff(arr,n));
		}
	}
}


class MaxDifference{
    
    // Function to find maximum difference of j-1
    // arr[]: input array
    // n: size of array
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int max = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                if(arr[i]<=arr[j])
                  {
                      if(j-i>max)
                        max = j-i;
                      break;
                  }
            }
        }
        return max;
        
    }
}
