import java.io.*;
import java.util.*;

class Driverclass
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			int k = sc.nextInt();
			System.out.println(new CountElement().countOccurence(arr,n,k));
		}
	}
}


class CountElement {

    // Function to find element with count more than n/k times
    // arr: input array
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        
        int count=0;
        for(int i:map.keySet())
        {
            if(map.get(i) > (n/k) )
                count++;
        }
        
        return count;
    }
}