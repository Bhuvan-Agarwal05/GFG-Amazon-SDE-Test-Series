import java.io.*;

class Array{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			int n = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(inputLine[i]);
			}

			Kadane obj = new Kadane();
			System.out.println(obj.maxSubarraySum(arr,n));
		}
	}
}


class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        int max = arr[0];
        int max_sofar = arr[0];
        
        for(int i=1;i<n;i++)
        {
            max_sofar = Math.max(arr[i] , max_sofar+arr[i]);
            if(max_sofar > max)
                max = max_sofar;
        }
        
        return max;
    }
    
}
