import java.io.*;
import java.util.*;

class Equilibrium{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0)
		{
			int n = Integer.parseInt(br.readLine().trim());
			long[] arr = new long[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				arr[i] = Long.parseLong(inputLine[i]);
			}

			EquilibriumPoint obj = new EquilibriumPoint();
			System.out.println(obj.equilibriumPoint(arr,n));
		}
	}
}


class EquilibriumPoint {

    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n) {
        if(n==1)
            return n;
        else
        {
            int sumright=0;
            for(int i=0;i<n;i++)
                sumright+=arr[i];
                
            int sumleft=0;
            sumright -= arr[0];
            
            for(int i=1;i<n-1;i++)
            {
                sumleft += arr[i-1];
                sumright -= arr[i];
                if(sumleft==sumright)
                    return i+1;
            }
            return -1;
        }
    }
}